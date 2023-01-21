package bookPrograms;

public class A4Palindrome {
	public static void main(String[] args) {
		int n = 3223;
		int temp = n ; 
		int rev = 0;
		int rem  ;
		while(temp!= 0 ){
			rem  = temp%10;    
			rev = rev*10+rem;
			temp = temp/10;
			
			
		}
		if(n == rev) {
			System.out.println(" This is palidonre number: " + n);
		}
		else {
			System.out.println("it's not palidrone : " + n);
		}
	}
	
}
