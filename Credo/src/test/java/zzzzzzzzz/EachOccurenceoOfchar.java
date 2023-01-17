package zzzzzzzzz;

import java.util.LinkedHashSet;

public class EachOccurenceoOfchar {
	public static void main(String[] args)
	{
		String s = "hello";
		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		
	}

}
