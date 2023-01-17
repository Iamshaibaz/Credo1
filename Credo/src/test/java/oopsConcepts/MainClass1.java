package oopsConcepts;


class Phone 
{
	String name ;
	public void unlock()
	{
		System.out.println("phone is unlocked : welcome !!!");
		
	}

}class Samsung extends Phone
{
	
	public void display()
	{
int memory = 30;
		System.out.println("samsund display memory is  "+ memory);
		
	}
}
public class MainClass1 
{
	public static void main(String[] args)
	{
		Phone p = new Phone();
		
		
		
	}
}