package cn.itcast.p1.otherapi;

import java.util.Properties;
import java.util.Set;

public class SystemDemo {

	public static void main(String[] args) {
		/*long l1 = System.currentTimeMillis();
		System.out.println(l1);*/
		demo_1();
	}
	public static void demo_1(){
		Properties tm =  System.getProperties();
		Set<String>  nameSet = tm.stringPropertyNames();
		for(String a : nameSet)
		{
			String value = tm.getProperty(a);
			System.out.println(a+"::::"+value);
		}
	}

}
