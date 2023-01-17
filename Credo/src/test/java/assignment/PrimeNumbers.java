package assignment;

public class PrimeNumbers {
	
	public static void main(String[] args)
	{
		int n = 7;
		int temp = 0;
		for(int i=2;i<=n-1;i++)
		{
			if(n%i==0)
			{
				temp = temp + i;
			}
		}
		if(temp>0)
		{
			System.out.println(n + " is not a prime number");
		}
		else
		{
			System.out.println(n + " is  a prime number");
		}
	}

	
}
