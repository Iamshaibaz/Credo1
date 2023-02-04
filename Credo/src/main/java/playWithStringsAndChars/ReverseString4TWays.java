package playWithStringsAndChars;

public class ReverseString4TWays {

	public static void main(String[] args) {
		String str = "shaibaz";
		
		//Approach 1 -----------------
		char[] ch_arr  = str.toCharArray();
		
		for(int i = str.length()-1; i>= 0 ; i-- ) {
			System.out.print(ch_arr[i]);
		}
		System.out.println();
		
		//Approach 2 -------------------
		for(int i = str.length()-1; i >=0; i --) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		
		
		//Approach 3 -------------
		StringBuffer stringbuffer = new StringBuffer(str);
		System.out.println(stringbuffer.reverse());
		
	
		
		//Approach 4 -------------
		StringBuilder stringbuilder = new StringBuilder(str);
		System.out.println(stringbuilder.reverse());
		
		
	}
}
