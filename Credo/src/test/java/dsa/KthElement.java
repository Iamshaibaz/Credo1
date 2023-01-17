package dsa;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class KthElement {
	
	static int kthsmallest(int a[],int k)
	{
		
		for(int i = 0;i<a.length;i++)
		{
			for(int j= i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j]= temp;
				}
			}
			

			if(i == k-1)
			{
			
			System.out.println(a[i]+" is the "+k+"  largest number");
			break;
			}
		}
		for(int i = 0;i<a.length;i++)
		{
			for(int j= i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j]= temp;
				}
			}
		
			if(i == k-1)
			{
			System.out.println(a[i]+" is the "+k+"  smallest number");
			break;
			}
	
		}
		return 0;
	}
	
	
	
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
			
		
		int a[] = {7,10,4,3,20,15};
		int k = 1;
		
		kthsmallest(a,k);
		
		
		
		
	}
	
}
