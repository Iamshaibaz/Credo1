package ownPrograms;

public class ArraySum {

	public static void main(String[] args)

{
		int[] a  = {6,1,4,2,5};
		int sum = 6;
		for(int i =0 ;i<a.length;i++)
		{
			for(int j = i+1;j<a.length;j++)
			{
			int	temp = a[i]+a[j];
			
			if(temp == sum)
			{
				System.out.println("yes it is equals "+a[i]+"----"+a[j]);
			}
			else
			{
				System.out.println("not equals");
			}
			}
		}
		}
}
