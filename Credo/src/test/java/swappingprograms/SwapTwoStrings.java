package swappingprograms;

public class SwapTwoStrings {

	
	public static void main(String[] args)
	{
		String s1="shaibaz";
		String s2="khan";
		
		s1 = s1+s2;  //shaibazkhan
		s2=s1.substring(0,s1.length()-s2.length());
		s1=s1.substring(s2.length());
		
		System.out.println("this string is s1  :"+s1);
		System.out.println("this string is s2:"+s2);
	}
}



