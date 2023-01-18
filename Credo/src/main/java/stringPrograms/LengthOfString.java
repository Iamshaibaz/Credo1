package stringPrograms;

public class LengthOfString {
	public static int length(String s1) {
		
		int length = 0 ;
		char[] arr = s1.toCharArray();
		
		for( char ch : arr) {
			length++;
			
		}
		return length;
		
		
	}
public static void main(String[] args) {
		
	String s1 = "this is shaibaz";
	System.out.println("length : "+ length(s1));
	
	}

	
}
