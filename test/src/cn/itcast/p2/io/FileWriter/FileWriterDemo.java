package cn.itcast.p2.io.FileWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException  {
		FileWriter fw = null;
		try {
			fw = new FileWriter("demo.txt");
			fw.write("abcdefg");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		finally
		{	if (fw!=null)
			try {
				fw.close();
			} catch (IOException e) {
				throw new RuntimeException("SB");
			}
		}
		FileReader fr = new FileReader("demo.txt");
		char [] buf = new char [3];
		int len =0;
		while((len=fr.read(buf))!=-1)
		{
			System.out.println(new String (buf,0,len));
		}
		
		
	}

}
