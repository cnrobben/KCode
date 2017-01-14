package cn.itcast.p2.io.FileWriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

public class GetFilesDemo {



	public static void main(String[] args) {
		File dir = new File("d:\\");
		List<File> list = new ArrayList<File>();
		FilenameFilter suf = new SuffixFileter(".rar");
		getFiles(dir,list,suf);
		File writeFile =new File(dir.getAbsolutePath(),"1.txt");
		writeFiles(writeFile,list);

	}

	public static void writeFiles(File writeFile, List<File> list) {
		
		BufferedWriter bufw=null;
		try {
			bufw=new BufferedWriter(new FileWriter(writeFile));
			for(File file:list)
			{	
				bufw.write(file.getAbsolutePath());
				bufw.newLine();
				bufw.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally
		{
			if(bufw!=null)
			try {
				bufw.close();
			} catch (IOException e) {
				throw new RuntimeException("πÿ±’ ß∞‹");
			}
		}
	}

	public static void getFiles(File dir, List<File> list, FilenameFilter suf) {
		File [] files =dir.listFiles();
		for(File file:files)
		{
			if(file.isDirectory())
				getFiles(file,list,suf);
			else 
				if(suf.accept(dir, file.getName()))
					list.add(file);
		}
	}

}
