package ownPrograms;

public class ReverseString {
	public static void main(String[] args)
	{
	String s= "dawf23wf";
	String alpha = "";
	String sum = "";
	
	for(int i = 0 ;i<s.length();i++)
	{
		if(s.charAt(i)>='0' && s.charAt(i)<='9')
		{
			alpha = alpha + s.charAt(i);
		}
		
	}
	System.out.println(alpha);
}}



