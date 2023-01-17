package zzzzzzzzz;

public class PrimeNumber {
	public static void main(String[] arsg)
	{
		int n = 8;
		int temp= 0;
		for(int i=2;i<=n-1;i++)
		{
			if(n%i==0)
			{
				temp = temp+i;
			}
			
		}if(temp>0)
		{
			System.out.println(n+" :it is not  prime number");
		}
		else 
		{
			System.out.println(n+" :is  prime number");
		}
	}

}
