package assignment;

public class FirstMaxvalueArray {

	public static void main(String[] args)
	{
		int a[] = {10,50,90,30,40};
		{
			for(int i=0;i<a.length;i++)
			{
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]<a[j])
					{
						int temp = a[i];
						 a[i]=a[j];
						a[j]=temp;
					}
					
				}
				
			}
			int sum=0;
			for(int i=0;i<5;i++)
			{
				
			System.out.println(" max: "+ a[i]);
			sum =sum +a[i];
			}
			
			System.out.println(sum);
		}
}
}