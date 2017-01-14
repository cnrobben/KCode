package cn.itcast.p2.io.FileWriter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Properties;


public class MergeFileDemo {

	public static void main(String[] args) throws IOException {
		File file =new File("C:\\split");
		megerFile(file);

	}

	public static void megerFile(File file) throws IOException {
		File[] files =file.listFiles(new SuffixFileter(".properties"));
		if(files.length!=1)
		{
			throw new RuntimeException("配置信息不存在，或者不唯一");
		}
		FileInputStream fis =new FileInputStream(files[0]);
		Properties prop =new Properties();
		prop.load(fis);
		int count=Integer.parseInt(prop.getProperty("partcount"));
		String name=prop.getProperty("name");
		File[] parts =file.listFiles(new SuffixFileter(".part"));
		if(parts.length!=count)
			throw new RuntimeException("碎片不齐全");
		
		ArrayList<FileInputStream> list =new ArrayList<>();
		for(int x=1;x<=count;x++)
		{
			list.add(new FileInputStream(new File(file,x+".part")));
		}
		Enumeration<FileInputStream> en= Collections.enumeration(list);
			SequenceInputStream sis =new SequenceInputStream(en);
			byte[] buf = new byte[1024];
			FileOutputStream fos =new FileOutputStream(new File(file,name));
		int len;
		while ((len=sis.read(buf))!=-1)
		{
			fos.write(buf, 0, len);
		}
		fos.close();
		sis.close();
	}

}
