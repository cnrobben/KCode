package cn.itcast.p2.io.FileWriter;

import java.io.File;

public class FileJavaDemo {

	public static void main(String[] args) {
		demo_2();
		
	}

	public static void demo_2() {
		File dir = new File("c:\\");
		File[] files = dir.listFiles(new FileFilterHidden());
		for (File name:files)
		{
			System.out.println(name);
		}
	}

	public static void demo_1() {
		File dir = new File("c:\\");
		String [] names = dir.list(new SuffixFileter(".txt"));
		for(String name:names)
		{
			System.out.println(name);
		}
	}

}
