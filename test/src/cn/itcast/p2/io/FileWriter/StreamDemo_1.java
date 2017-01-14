package cn.itcast.p2.io.FileWriter;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class StreamDemo_1 {

	public static void main(String[] args) throws IOException {
		InputStream in = System.in;
	    StringBuilder sb =new StringBuilder();
		int ch=0;
		while((ch=in.read())!=-1)
		{
			if(ch=='\r')
			continue;
			if(ch=='\n')
			{	String temp=sb.toString();
				if("over".equals(temp))
				break;
				System.out.println(sb.toString());
				sb.delete(0, sb.length());
			}
			else	
			sb.append((char)ch);
			
			
		}
	}}

