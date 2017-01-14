package cn.itcast.p2.io.FileWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class InfoDemo {

	public static void main(String[] args) throws IOException {
		FileWriter dir = new FileWriter("info.txt");
		infoWrite(dir);

	}

	public static void infoWrite(FileWriter dir) throws IOException {
		Properties prop = new Properties();
		prop.setProperty("zhangsan", "20");
		prop.setProperty("lisi", "20");
		prop.setProperty("wangyu", "20");
		prop.setProperty("zhaoliu", "20");
		
		prop.store(dir, "Fc");

	}

}
