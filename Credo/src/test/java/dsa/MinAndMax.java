package dsa;

public class MinAndMax {

	
	public static void main(String[] args) {
		int a[] = {2,3,5,3,2,1};
		
		int min = a[0];
		int max = a[0];
		for(int i =0;i<a.length;i++)
		{
			if(a[i]>max) 
				
			{
				max = a[i];
				
		}if(a[i]<min) {
			min = a[i];
		}
			
		}
		System.out.println(min + " is a minimum and " + max + " is a max in array");
	}
}
