package zzzzzzzzz;

public class ReverseNumberRough {

	public static void main(String[] args)
	{
		int num = 6789;
		int rev = 0 ;

		for(int i = 0 ; i<num;i++)
		{
			while(num>0){
				int rem = num%10;
				rev = rev * 10+rem;
				num = num/10;
				
				
			}
			
		}System.out.println(rev);
	}
}
