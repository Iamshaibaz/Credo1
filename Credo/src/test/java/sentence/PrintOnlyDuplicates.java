package sentence;

import java.util.HashSet;

public class PrintOnlyDuplicates {
	
	public static void main(String[] args)
	{
		//create a set collection and a ll the words store in that
		HashSet<String> set = new HashSet<String>();
		String s="Welcome to Tyss Welcome to";
		String[] str = s.split(" ");
		for(int i=0;i<str.length;i++)
		{
			set.add(str[i]);
		}
		//com
		for(String word:set)
		{ 
			
			int count=0;
			for(int i=0;i<str.length;i++)
			{
				if(word.equals(str[i]))
					count++;
			}
		if(count>1)
			System.out.println(word+" = "+count);
		}
	}

}
