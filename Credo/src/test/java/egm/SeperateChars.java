package egm;

public class SeperateChars {

	
	public static void main(String[] args)
	{
		String s = "jsaklK3k2l3L@#$L";
		String alpha = "";
		String num = "";
		String symbol = "";
		
		for(int i = 0; i<s.length();i++)
		{
			if((s.charAt(i)>='A') && (s.charAt(i)<='Z') || (s.charAt(i)>='a' && s.charAt(i)<='z'))
			{
				alpha = alpha +s.charAt(i);
			}
			else if((s.charAt(i)>='0' && s.charAt(i)<='9'))
			{
				num =num+s.charAt(i);
				
			}
			else {
				symbol= symbol+s.charAt(i);
			}
			
		}
		
		System.out.println(alpha);	
		System.out.println(num);
		System.out.println(symbol);
		
	}
}
