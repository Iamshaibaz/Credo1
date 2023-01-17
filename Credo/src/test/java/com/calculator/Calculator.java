package com.calculator;


class Add
{
	 int add(int a,int b)
	{
		return a +b;
		
	}
	 double add(double a,double b)
	{
		return a +b;
	}



}
class Mul
{
	int mul(int a, int b)
	{
		return a*b;
	}
	double mul(double a,double b)
	{
		return a *b;
	}
	
}

class Sub
{
int sub(int a,int b)
{
	return a - b;
}
double sub(double a ,double b)
{
	return a -b;
}
}
class Div
{
	int div(int a, int b)
	{
		return a /b;
		
	}
	double div(double a , double b)
	{
		return a /b;
	}
	
}


public class Calculator {
	public static void main(String[] args)
	{

		Add ad = new Add();
		System.out.println(ad.add(12, 13));
		
		
		Sub sub = new Sub();
		System.out.println(sub.sub(4.3, 3));
		
		Mul mul = new Mul();
		System.out.println(mul.mul(4, 4));
			
		Div div = new Div();
		System.out.println(div.div(2, 4));
		
	}
}
