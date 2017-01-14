package cn.itcast.p2.io.FileWriter;

import java.io.File;

public class DeleteFileDemo {

	public static void main(String[] args) {
		File dir = new File("F:\\QMDownload");
		delete(dir);

	}

	public static void delete(File dir) {
		 File [] files =dir.listFiles();
		 for(File file:files)
		 {
			 if(file.isDirectory())
			 {
				 delete(file);
			 }
			 else
			 {
				 System.out.println(file.getName()+file.delete());
			 }
		 }
		 System.out.println(dir.getName()+dir.delete());
	}

}
