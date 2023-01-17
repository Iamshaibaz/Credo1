package dsa;

public class MinAndMaxElementInArray {
	
	public static void main(String[] args)
	{
		int arr[] = {3,4,5,3,2,1};
		int len = arr.length;
		
		for(int i = 0; i<len;i++)
		{
			for( int j = i+1;j<len;j++)
				
			{
				if(arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
				}
			}
			
			System.out.println(arr[i]);
		}
		System.out.println(arr[0] +" is minimum and "+arr[len-1]+" is max");
		
	}

}
