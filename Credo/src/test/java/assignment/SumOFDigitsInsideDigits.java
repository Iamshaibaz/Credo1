package assignment;

public class SumOFDigitsInsideDigits {
         public static void main(String[] args)
         {
        	 int n=8484;
        	 while(n>9)
        		{
        			int sum=0;
        			while(n>0)
        			{
        				int rem=n%10;
        				sum=sum+rem;
        				n=n/10;
        			}
        			n=sum;
        		}
               	System.out.println(n);
         }
}
