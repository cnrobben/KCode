package cn.itcast.p2.io.FileWriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Zhuanyi {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("c:\\demo.txt");
		FileWriter fw = new FileWriter("d:\\1.txt");
		int ch = 0;
		while ((ch=fr.read())!=-1)
		{
			fw.write(ch);
		}
		fw.close();
		fr.close();

	}

}
