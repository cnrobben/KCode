package cn.itcast.p2.io.FileWriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileBufferedDemo {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("demo.txt");
		FileWriter fw = new FileWriter("d:\\copy_demo.txt");
		BufferedReader bufr =new BufferedReader(fr);
		BufferedWriter bufw =new BufferedWriter(fw);
		String line = null;
		while ((line=bufr.readLine())!=null)
		{
			bufw.write(line);
			bufw.newLine();
			bufw.flush();
		}
	}

}
