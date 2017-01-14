package cn.itcast.p2.io.FileWriter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyRead {

public static void main(String[] args) throws IOException {
		/*FileReader fr = new FileReader("demo.txt");
		BufferedReader br = new BufferedReader(fr);
		String line=null;
		while((line=br.readLine())!=null)
		{
			System.out.println(line);
		
		}
		br.close();
		//fr.close();
	}*/
	char[] buf =new char[1024];
	int len;
	FileReader fr = new FileReader("demo.txt");
	FileWriter fw = new FileWriter("1.txt");
	while ((len=fr.read())!=-1)
	{
		 fw.write(buf);
		}
	}

}
