package sentence;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class UniqueWordsOnly {
	
	public static void main(String[] args)
	{
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		String s="Welcome to Tyss Welcome to banglore";
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
			if(count==1)
		
			System.out.println(word+" = "+count);
		}
	}

}
