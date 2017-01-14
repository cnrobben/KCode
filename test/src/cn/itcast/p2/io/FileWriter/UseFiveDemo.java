package cn.itcast.p2.io.FileWriter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class UseFiveDemo {

	public static void main(String[] args) throws IOException {
		shiYong();

	}

	public static void shiYong() throws IOException {
		File file = new File("e:\\time.properties");
		if(!file.exists())
		{
			file.createNewFile();
		}
		FileInputStream fis = new FileInputStream(file);
		Properties prop =new Properties();
		prop.load(fis);
		int count=0;
		if(prop.getProperty("time")!=null)
		{
			count =Integer.parseInt(prop.getProperty("time"));
			if (count ==5)
			{
				throw new RuntimeException("–÷µ‹£¨∏√≥Â«Æ¡À");
			}
		}
		FileOutputStream fos = new FileOutputStream(file);
			count++;
			prop.setProperty("time",String.valueOf(count));
			prop.store(fos, "");
			fis.close();
			fos.close();
	}

}
