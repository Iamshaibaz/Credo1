package assignment;

public class ArrayBubbleSor {

	public static void main(String[] args) {
	
	int a[] = {10,30,50,40,20};             //create array

	{
		for(int i=0;i<a.length;i++)         //outer loop
		{
			for(int j=i+1;j<a.length;j++)   //inner loop
			
			{
				if(a[i]>a[j])                //if i>j then go inside
				{
				int temp = a[i];             //swapping concept
				a[i]=a[j]; 
				a[j]=temp;
			
			}
		}
	}
		for(int i = 0; i <a.length;i++)
	      {
		      System.out.print(a[i]+" ");
                }
	}
}
	}