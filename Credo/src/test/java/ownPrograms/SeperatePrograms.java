package ownPrograms;

public class SeperatePrograms {
	public static void main(String[] args)
	{
		
		String s = "23dfa dsADSD A32";
		String alpha = "";
		String num  ;
		String sp = "";
		for(int i = 0 ; i<s.length();i++)
		{
			if(s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				alpha = alpha + s.charAt(i);
			}
		}System.out.println(alpha);
	}
}
