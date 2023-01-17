package dsa;

import java.util.Scanner;

public class SubArraySum {
	public static void main(String[] args)
	{
		int a[] = {2,2,4,2,4};
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		sc.close();
		System.out.println("we are starting from "+ start +" and ending at "+end);
		for(int i = start+1 ; i<=end;i++)
		{
			sum =sum + a[i];
			
		}
		System.out.println(sum);
	}
	

}
