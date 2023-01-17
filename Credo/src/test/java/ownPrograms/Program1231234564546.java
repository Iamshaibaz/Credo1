package ownPrograms;

import java.util.LinkedHashSet;

public class Program1231234564546 {
	
	public static void main(String[] args)
	{
		String s = "12312345456";//1+2+3+4+5+6
	
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i = 0 ; i < s.length();i++)
		{
			set.add(s.charAt(i));
			
		}System.out.println(set);
		int sum = 0;
		for(Character ch : set)
		{
			sum = sum + ch-48;
			
		}System.out.println(sum);

	}

}
