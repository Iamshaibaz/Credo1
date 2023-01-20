package ownPrograms;

public class ArrayPali {
	public static void main(String[] args)
	{
		int a[] = {898,234,324,5252,54,65,111};
		for(int i = 0 ; i < a.length; i++)
		{
			int sum = 0;
			int n = a[i];
			while (n>0)
			{
				int rem = n%10;
				sum = sum *10+rem;
				n = n /10;
				
			}
			if(sum == a[i])
			{
				System.out.println(sum);
			}
			
		}

}
}