package abstractionInterface;

public class Tv implements Switch {

   public 	void switchOn()
	{
		System.out.println("tv on ");
	}
   public void switchOff()
   {
	   System.out.println("tv is off");
   }
}
