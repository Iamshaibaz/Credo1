package zzzzzzzzz;

public class FibonnacciPractice {
	public static void main(String[] args)
	{
		int a =0,b =1, c;
		int n=10;
		System.out.print(a +" "+b);
		for(int i=0;i<n;i++)
		{
			c=a+b;
			System.out.print(" "+c);
			
			a=b;
			b=c;
			
		}
	}

}
