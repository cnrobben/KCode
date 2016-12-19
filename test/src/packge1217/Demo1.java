package packge1217;
public class Demo1 {

	public static void main(String[] args) {
		String s1 ="-ab---c-  ";
		System.out.println(s1);
			
			System.out.println(fuck(s1));
		}
	private static String fuck (String s1)
	{
		      int a =qian(s1);
		      int b =hou(s1);
		      return	(s1.substring(a,b));
	}
	private static int qian(String s1) {
			int x=0;
		  	while(s1.substring(x, x+1).contains("-"))
		  			{x++;}
				  return x;
	      }
		 

	private static int hou(String s1) {
				int x=s1.length();
	  	while(s1.substring(x-1, x).contains("-"))
	  			{x--;}
			  return x;
      }
	  }