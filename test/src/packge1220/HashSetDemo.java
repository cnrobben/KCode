package packge1220;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		
			HashSet hs = new HashSet();
			hs.add("haha");
			hs.add("xixi");
			hs.add("hehe");
			hs.add("fuck");
			hs.add("canima");
			Iterator it = hs.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
			
			
			
			
	}

}
