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
		a1.add(new Worker("����",20));
		a1.add(new Worker("����",20));
		a1.add(new Worker("����",20));
		a1.add(new Worker("����",20));
		ArrayList <Student> a2 = new ArrayList<Student>();
		a2.add(new Student("���",20));
		a2.add(new Student("���",20));
		a2.add(new Student("��ʮ",20));
		a2.add(new Student("��һ",20));
		 
		
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
