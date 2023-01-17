  package ownPrograms;

public class OnlyOneLetterCaps {
	
public static void main(String[] args)
{
	String s1 = "shaibaz";
	String rev="";
	for(int i = s1.length()-1;i>=0;i--)
	{
		rev = rev + s1.charAt(i);
		
	}
	String output = rev.substring(0,1).toUpperCase()+rev.substring(1);
	System.out.println(output);
}

}
