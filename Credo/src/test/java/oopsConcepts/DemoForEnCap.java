package oopsConcepts;

public class DemoForEnCap {
	
	public static void main(String[] args)
	{
		StudentEncaps s1 = new StudentEncaps();
		s1.setAge(30);
		s1.setPer(40.00);
		System.out.println(s1.getAge());
		System.out.println(s1.getPer());
	}

}
