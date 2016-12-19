package packge1217;

public class StringDemo {

	public static void main(String[] args) {
		String [] arr ={"nba","abc","cba","zz","qq","haha"};
		for (int i=0;i<arr.length-1;i++)
		{	for(int j=0;j<arr.length-i-1;j++)
			{	
				int x = arr[j].compareTo(arr[j+1]);
					if(x>0)
					{
						String temp = arr[j];
						arr[j]	= arr[j+1];
						arr[j+1]= temp;
					}
			}
		}
		for (int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
