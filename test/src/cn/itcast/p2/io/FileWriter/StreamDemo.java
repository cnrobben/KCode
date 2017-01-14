package cn.itcast.p2.io.FileWriter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("demo.txt");

		FileOutputStream fos = new FileOutputStream("1.txt");
		
		byte [] ch =new byte[1024];
		int len;
		while((len=fis.read())!=-1)
		{	
			fos.write(ch);
			System.out.println(len);
		}
		
		fos.close();
		fis.close();
	}

}
