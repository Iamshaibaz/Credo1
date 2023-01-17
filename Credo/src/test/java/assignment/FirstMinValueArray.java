package assignment;

public class FirstMinValueArray {

	public static void main(String[] args)
	{
		int a[] = {10,50,90,30,40};
		{
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;i<a.length;i++)
				{
					if(a[i]<a[j])// change this if you want max value
					{
						int temp = a[i];
						 a[i]=a[j];
						a[j]=temp;
					}
					
				}
				
			}
			System.out.println("first minimum element is "+ a[0]);
			
		}
}
}