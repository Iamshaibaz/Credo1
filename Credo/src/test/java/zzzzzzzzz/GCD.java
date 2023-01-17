package zzzzzzzzz;

public class GCD {
	
	public static void main(String[] args)
	{
		int n1= 30;
		int n2 = 20;
		int gcd = 0;
		for(int i =1;i<=n1&& i<=n2;i++)
		{
			if(n1%i==0 && n2%i == 0)
			{
				gcd = i;
				
			}
		
		}
		System.out.println(n1+"  and "+n2+" gcd is : " +gcd);
	}

}
