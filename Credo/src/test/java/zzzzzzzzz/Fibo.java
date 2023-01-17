package zzzzzzzzz;

public class Fibo {
	public static void main(String[] args)
	{
		int a=0;
		int b=1;
		int f=50;
		System.out.println(a+" "+b);
		int c;
		for(int i =1;i<=f;i++)
		{
			c=a+b;
			System.out.println(" "+c);
			a=b;
			b=c;
			
		}
	}
}
