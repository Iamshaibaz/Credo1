package abstractionInterface;

public class Office {

	public static void main(String[] args)
	{
		Switch s = new Tv();
		s.switchOn();
		s.switchOff();
		Switch s1 = new Fan();
		s1.switchOn();
		s1.switchOff();
	}
}
