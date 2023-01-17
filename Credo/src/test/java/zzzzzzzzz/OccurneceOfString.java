package zzzzzzzzz;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class OccurneceOfString {

	public static void main(String[] args)
	{
		String s = "aadffe";
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i =0;i<s.length()-1;i++)
		{
			set.add(s.charAt(i));
		}
		for(Character ch:set)		
		{
			int count= 0;
			for(int i = 0 ; i<s.length()-1;i++)
			{
				if(ch==s.charAt(i))
				{
					count ++;
				}
			}
			
			if(count==1)
			{
				System.out.println(ch +" print "+" "+count+" times");
			}
			
		}
		
	}
}
