package packge1225;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


import bean.Person;
import bean.Student;
import bean.Worker;

public class GenericsDemo {

	public static void main(String[] args) {
		ArrayList <Worker> a1 = new ArrayList<Worker>();
		a1.add(new Worker("李四",20));
		a1.add(new Worker("李五",20));
		a1.add(new Worker("李六",20));
		a1.add(new Worker("李七",20));
		ArrayList <Student> a2 = new ArrayList<Student>();
		a2.add(new Student("李八",20));
		a2.add(new Student("李九",20));
		a2.add(new Student("李十",20));
		a2.add(new Student("李一",20));
		 
		
	}

public  static void show(Collection<? extends Person>  al) {
		Iterator<? extends Person> it = al.iterator();
		while (it.hasNext())
		{	
			Person p = (Person)it.next();
			System.out.println(p.getName()+p.getAge());
		}
	}

}
