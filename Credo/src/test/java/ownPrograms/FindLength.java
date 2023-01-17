package ownPrograms;

public class FindLength {
	public static void main(String[] args)
	
	{
		int legnth = 0;
		String s = "shaibaz";
		char[] strArray = s.toCharArray();
		for(char ch:strArray)
		{
			legnth++;
			
		}System.out.println("lenght of given string is : "+ legnth);
	}
}
