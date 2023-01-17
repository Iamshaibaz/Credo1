package dsa;

public class ReverseArray {
	
	public static void main(String args[])
	{
		int a[] = {3,4,1,1,5};
		int len = a.length;
		for(int i = len-1 ; i >=0;i--)
		{
			System.out.println(a[i]);
		}
	}

}
