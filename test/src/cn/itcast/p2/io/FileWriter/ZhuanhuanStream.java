package cn.itcast.p2.io.FileWriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class ZhuanhuanStream {

	public static void main(String[] args) throws IOException {
		
		InputStream in = System.in;
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);
		OutputStream out =new FileOutputStream("a.txt");
		OutputStreamWriter osw = new OutputStreamWriter(out);
		BufferedWriter bw =new BufferedWriter(osw);
		String line;
		while((line=br.readLine())!=null)
		{
			if (line.equals("over"))
				break;
			bw.write(line.toUpperCase());
			bw.newLine();
			bw.flush();
		}
	}

}
