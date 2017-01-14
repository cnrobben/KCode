package cn.itcast.p2.io.FileWriter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class SplitFileDemo {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\1.mp3");
		FileInputStream fis =new FileInputStream(file);
		FileOutputStream fos =null;
		File dir = new File("c:\\split");
				if(!dir.exists())
				{
					dir.mkdirs();
				}
		byte[] buf =new byte[1024*1024];
		int len=0;
		int count=1;
		while((len=fis.read(buf))!=-1)
		{	
			fos=new FileOutputStream(new File(dir,(count++)+".part"));
			fos.write(buf, 0, len);
			fos.close();
		}
		 	fis.close();
		Properties prop =new Properties();
		prop.setProperty("name", file.getName());
		prop.setProperty("partcount", count-1+"");
		prop.store(new FileOutputStream(new File(dir,count+".properties")), "save info");
	}

}
