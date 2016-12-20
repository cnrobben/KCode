package packge1220;

import java.util.Arrays;

public class Shuzipaixu {

	public static void main(String[] args) {
		String numStr = "12 32 32 1 32 45 -1 -32 -87 -11 99";
		System.out.print(sortStringNum(numStr));
	}

	public static String sortStringNum(String numStr) {
		String [] str_arr=toSplit(numStr);
		int [] num_arr = toArray(str_arr);
		sortArray(num_arr);
		String newStringNum = toString(num_arr);
		return newStringNum;
	}



	public static String toString(int[] num_arr) {
			StringBuilder sb = new StringBuilder();
		for (int i=0;i<num_arr.length;i++)
		{
			if (i<num_arr.length-1)
			{
				sb=sb.append(num_arr[i]+" ");
			}
			else 
				sb=sb.append(num_arr[i]);
		}
				 String str = sb.toString();
				 return str;
	}

	public static void sortArray(int[] num_arr) {
		Arrays.sort(num_arr);
	}

	public static int[] toArray(String[] str_arr) {
			int [] num_arr = new int[str_arr.length];
			for (int i=0;i<str_arr.length;i++)
			{
				num_arr[i]=Integer.parseInt(str_arr[i]);
			}
				return num_arr;
	}

	public static String[] toSplit(String numStr) {
			String [] str_arr = numStr.split(" ");
				return str_arr;
	}

}
