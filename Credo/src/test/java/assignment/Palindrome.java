package assignment;

public class Palindrome {

	public static void main(String[] args) {
		int n = 454;
		int temp = n;
		int rev=0;
	    int rem;
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp = temp/10;
		}
		if(n==rev)
		{
			System.out.println("it is palindrome");
		}
		else 
		{
			System.out.println("it is not palindrome ");
		}

	}

}
