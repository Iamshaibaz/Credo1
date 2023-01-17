package polymorphism;

class PhonePe
{
 static void pay(String name)
	{
		System.out.println("Money sending using name phonepe "+ name);
	}
	static void pay(int number)
	{
		System.out.println("Money sending using num phonepe "+ number);
	}


//public class Payment {

public static void main(String[] args)
	{
		//PhonePe p = new PhonePe();
		//p.pay("kingkhan");
		//p.pay(9393933);
		pay(4988);
	pay("snehal");
	}
	
}
