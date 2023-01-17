package oopsConcepts;

public class StudentEncaps {
	
	private double per;
	private int age ;
	public void setAge(int age)
	{
		if(age>0 && age<=40)
		{
			this.age =  age;
			
		}
		else
		{
			System.out.println("give proper data");
		}
	}
	public void setPer(double per)
	{
		if(per>0 && per<=100 )
		{
			this.per = per;
		}
		else
		{
			System.out.println("give valid percentage: ");
		}
	}
	public int getAge()
	{
		return age;
	}
	public double getPer()
	{
		return per;
	}
	
}


