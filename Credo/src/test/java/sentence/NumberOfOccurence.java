package sentence;

import java.util.HashSet;

public class NumberOfOccurence {
	
	public static void main(String[] args)
	{
		
		HashSet<String> set = new HashSet<String>();
		String s="Welcome to Tyss Welcome to";
		String[] str = s.split(" ");
		for(int i=0;i<str.length;i++)
		{
			set.add(str[i]);
		}
		
		for(String word:set)
		{ 
			
			int count=0;
			for(int i=0;i<str.length;i++)
			{
				if(word.equals(str[i]))
					count++;
			}
		
			System.out.println(word+" = "+count);
		}
	}

}
