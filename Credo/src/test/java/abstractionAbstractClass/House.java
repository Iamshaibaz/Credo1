package abstractionAbstractClass;

public class House {
	
	public static void main(String[] args)
	{
		Bulb b = new Bulb();
		b.switchOn();
		b.switchOff();
		
		Switch s = new Bulb();
		s.switchOn();
		s.switchOff();
	}
	

}
