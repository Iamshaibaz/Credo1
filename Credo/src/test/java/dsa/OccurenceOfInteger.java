package dsa;

public class OccurenceOfInteger {

	
	public static void main(String[] args)
	{
		int arr[] = {3,2,4,2,5,2,6,3};
		
		int x = 2;
		int count = 0;
		int dup =0;
		for(int i = 0; i <arr.length;i++)
		{
			if(arr[i]==x)
			{
				dup = arr[i];
				count ++;
				
			}
		
			
			
			
		
		}
			System.out.println(dup+" printing " + count + " times ");
		
		
	}
}
