package egm;

public class SERPEC {

	
	
	public static void main(String[] argsq) {
		
		String s = "sklfskk3kl";
		String alpha = "";
		String num ="";
		String sp = "";
		
		for(int i = 0; i<s.length();i++)
		{
			if(s.charAt(i)>='A' && s.charAt(i)<='Z' || (s.charAt(i)>='a' && s.charAt(i)<='z'))
			{
				alpha = alpha + s.charAt(i);
			}
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				num = num + s.charAt(i);
			}
			else 
			{
				sp = sp+s.charAt(i);
			}
		}
		System.out.println(alpha);
		System.out.println(num);
		System.out.println(sp);
	}
}
