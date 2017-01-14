package cn.itcast.p2.io.FileWriter;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class MyBufferedReader  {
	private FileReader r;
	private int pos=0;
	private int count=0;
	private char [] buf = new char[1024];
	public MyBufferedReader(FileReader r) {
		this.r = r;
	}
	
	public int myRead() throws IOException
	{	
		if(count<0)
	    {
		    return -1;
	    }
		if(count==0)
		{
			count = r.read(buf);
			pos=0;
		}
		char ch = buf[pos];
		pos++;
		count--;
		return ch;
	}
	public String myReadLine() throws IOException
	{
		StringBuilder sb =new StringBuilder();
		int ch=0 ;
		while((ch=myRead())!=-1)
		{	
			if(ch=='\r')
				continue;
			if(ch=='\n')
				return sb.toString();
			sb.append((char)ch);
		}
		if(sb.length()!=0)
	    return sb.toString();
		return null;
	}
	public void myClose() throws IOException
	{
		r.close();
	}
}
