package ownPrograms;

public class ReverseNumber {
	public static void main(String[] args)
	{
		int num = 12030;
		int sum = 0;
		for(int i=0;i<num;i++)
		{
			while(num>0)
			{
			int rem = num%10;
			sum = sum * 10+rem;
			num= num /10;
			}
			
		}System.out.println(sum);
	}

}
