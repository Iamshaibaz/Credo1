package bookPrograms;

public class A6StringPalindrone {
	public static void main(String[] args) {
		String s = "shs";
		String rev = "";
		
		for(int i = s.length()-1 ; i >=0 ; i --) {
			rev = rev + s.charAt(i);
			
		}
		if(s.equals(rev)) {
			System.out.println(" the string is palidrome:-> [ " + s +" ]");
		}
		else 
		{
			System.out.println(" The string is not palindrome:->[ "+ s+" ]" );
		}
	}
	
	
}
