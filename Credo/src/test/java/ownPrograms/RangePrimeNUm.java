package ownPrograms;

import java.util.Scanner;

public class RangePrimeNUm {
	public static void main(String[] args )
	{
		Scanner sc = new Scanner(System.in);
		
		int  a =sc.nextInt();
		int b= sc.nextInt();
		sc.close();
		for(int i =a ; i<= b;i++)
		{int temp = 0;
			for(int j = 2 ; j<=i-1;j++)

		{
			if(i%j==0)
			{
				temp = temp + 1;
			}
		
		
		}if(temp == 0 )
		{
			System.out.println(i +" it is prime number");
		}
		else {
			temp = 0;
		}
		}
			
		}
		
		
	}


