package packge1228;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		String str = "Zzdsahdaskdhasjkd";
		char[] s = str.toCharArray();
		TreeMap<Character,Integer> ts =new TreeMap<Character,Integer>(); 
		for(int i=0;i<s.length;i++)
		{
			if (!ts.containsKey(s[i]))
			{
				ts.put(s[i], 1);
			}
			else 
				{
					int temp=ts.get(s[i]);
					temp++;
					ts.put(s[i], temp);
					
				}
				
		}
		Iterator<Map.Entry<Character, Integer>> it = ts.entrySet().iterator();
			while(it.hasNext())
			{		
					Map.Entry<Character, Integer> me = it.next();
					Character	 str1 = me.getKey();
					int num = me.getValue();
					System.out.print(str1+"("+num+")");
			}
	}

}
