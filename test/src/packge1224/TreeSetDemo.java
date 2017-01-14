package packge1224;

import java.util.Iterator;
import java.util.TreeSet;

import Comparetor.ComparetorByLength;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String>ts = new TreeSet<String>(new ComparetorByLength());
		ts.add("abcd");
		ts.add("sad");
		ts.add("asdsa");
		ts.add("afdg");
		ts.add("fdj");
		ts.add("12");
		ts.add("1fs");
		ts.add("");
		Iterator<String> it = ts.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
