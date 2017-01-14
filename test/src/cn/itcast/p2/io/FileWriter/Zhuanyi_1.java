package cn.itcast.p2.io.FileWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Zhuanyi_1 {

	private static final int BUFF_SIZE = 4096;

	public static void main(String[] args) {
		FileReader fr =null;
		FileWriter fw =null;
		try {
			fr = new FileReader("c:\\demo.txt");
			fw = new FileWriter("d:\\demo.txt");
			char [] cbuf = new char [BUFF_SIZE];
			int len =0;
			while ((len=fr.read(cbuf))!=-1)
			{
				fw.write(cbuf, 0, len);
			}
		} catch (Exception e) {
			
		}
		finally 
		{
			if (fr!=null)
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			if (fw!=null)
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}

}
