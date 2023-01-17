package ownPrograms;

public class SumofDig {
	
	public static void main(String[] args)
	{
		int n = 1231;
		
		int sum =0;
		while(n>0)
		{
			int dig = n%10;
			sum = sum + dig;
			n = n/10;
		}System.out.println(sum);
		
	}
}
