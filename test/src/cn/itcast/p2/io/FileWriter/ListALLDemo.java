package cn.itcast.p2.io.FileWriter;

import java.io.File;

public class ListALLDemo {

	public static void main(String[] args) {
		File dir = new File("E:\\1");
		listall(dir,0);
	}

	private static void listall(File dir,int level) {
		File [] file =dir.listFiles();
		System.out.println(getSpace(level)+dir.getName());
		level++;
		for (int i=0;i<file.length;i++)
		{	
			if (file[i].isDirectory())
			{	listall(file[i],level);
				}
			else
			{	
				System.out.println(getSpace(level)+file[i].getName());
				
			}
		}
	}

	private static String getSpace(int level) {
		StringBuilder sb =new StringBuilder();
				for (int x=0;x<level;x++)
				{
					sb.append("|--");
				}
				return sb.toString();
	}

}
