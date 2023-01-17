package constructor;

public class Addition {
	int a ;
	int b;
	int c;
	Addition(int a)
	{
		this.a = a;
		System.out.println(a);
		
		
	}
	Addition(int a,int b)
	{
		this.a = a;
		this.b = b;
		System.out.println(a+b);
		
	}Addition(int a,int b,int c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
		
		System.out.println(a+b+c);
	}
	public static void main(String[] args)
	{
		Addition a =new Addition(3,5,5);
		
		
	}

}
