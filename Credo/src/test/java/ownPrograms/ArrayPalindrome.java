package ownPrograms;

public class ArrayPalindrome {

	public static void main(String[] args)
	{

		int a[] = {233,444,334,323,454,2232};
		for(int i=0;i<a.length;i++)
		{
			int n = a[i];
			int sum = 0;
			while(n>0)
			{
				int rem = n%10;
				sum = sum * 10 +rem;
				n = n/10;
				
			}
			if(sum==a[i])
			{
			System.out.println(a[i]);
			}
		}
	}
}
