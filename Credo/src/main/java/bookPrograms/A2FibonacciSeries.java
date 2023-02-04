package bookPrograms;

import java.util.Scanner;

public class A2FibonacciSeries {
	
	public static void main(String[] args) {
		int a = 0 , b = 1,c;
	//	c = a+ b ;
		Scanner sc = new Scanner(System.in);
		int var = sc.nextInt();
		System.out.print(a + " "+b );
		for(int i =1; i<var;i++) {
			c= a + b; 
			System.out.print(" "+c+ " ");
			a = b;
			b = c ;
		}
	}

}
