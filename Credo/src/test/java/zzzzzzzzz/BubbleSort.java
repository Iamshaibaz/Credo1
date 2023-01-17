package zzzzzzzzz;

public class BubbleSort {

	public static void main(String[] args)
	{
		int a[] = {10,49,53,23,15,34};   //create array 
		
		for(int i =0;i< a.length;i++)    //outer loop
		{
			for(int j=i+1;j<a.length;j++)//inner loop
			{
				if(a[i]>a[j])            //if i greater than j 
				{
					int temp = a[i];     //swapping logic
					a[i]=a[j];
					a[j]=temp;
					
							
				}
			}
			
		}for(int i=0;i<a.length;i++)
		{
			System.out.print(" "+a[i]);
		}
		
		
	}
}
