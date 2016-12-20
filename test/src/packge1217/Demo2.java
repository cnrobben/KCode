package packge1217;

public class Demo2 {

	public static void main(String[] args) {
		String s ="           ";
		String s1=stringDemo2(s);
		System.out.println(s);
		System.out.println(s1);
	}

	private static String stringDemo2(String s1) {
		int start=0,end =s1.length()-1;
			while(start<=end&&s1.charAt(start)==' ')
			  start++;
			while(end>=start&&s1.charAt(end)==' ')
					end--;
			System.out.println("start="+start+"end="+end);
			return s1.substring(start, end+1);
	}		

}
