package cn.itcast.p2.io.FileWriter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ChangeInfoDemo {

	public static void main(String[] args) throws IOException {
		File file = new File("info.txt");
		if(!file.exists())
		{
			file.createNewFile();
		}
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(file);
		prop.load(fis);
		prop.setProperty("zhangsan", "1");
		FileOutputStream fos =new FileOutputStream(file);
		prop.store(fos, "fuc");
		fos.close();
		fis.close();
	}

}
