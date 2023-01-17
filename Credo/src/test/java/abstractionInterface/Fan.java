package abstractionInterface;

public class Fan implements Switch {
	
	public void switchOn()
	{
		System.out.println("fan is running");
	}
	
	public void switchOff()
	{
		System.out.println("fan stop rotating");
	}

}
