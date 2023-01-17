package oopsConcepts;

import net.bytebuddy.implementation.bind.annotation.Super;

class Vegetable 
{
	public Vegetable(int price, String color, int quantity) {
		super();
		this.price = price;
		this.color = color;
		this.quantity = quantity;
	}
	int price ;
	String color ;
	int quantity;
	void wash()
	{
		System.out.println("wash the vegetable");
	}
	void chop()
	{
		System.out.println("chop the vegetable");
		
	}
	
}
class Carrot extends Vegetable
{
	public Carrot(int price, String color, int quantity) {
		super(price, color, quantity);
		// TODO Auto-generated constructor stub
	}
	void preparecarrothalwa()
	{
		System.out.println("carrot halwa is preparing halwa");
		
	}//void wash()
	{
		//System.out.println("wash the carrot ");
	}
	void chop()
	{
		System.out.println("chop the carrot in carrto class ");
	}
}

public class MainClass3Veg {

	public static void main(String[] args)
	{
		Vegetable v = new Carrot(20, "red", 3);
		v.wash();
        System.out.println(v.color);
        v.chop();
	}
}
