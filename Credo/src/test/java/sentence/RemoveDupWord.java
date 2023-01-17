package sentence;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDupWord {
	
	public static void main(String[] args)
	{
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		String s="Welcome to Tyss Welcome";
		String[] str = s.split(" ");
		for(int i=0;i<str.length;i++)
		{
			set.add(str[i]);
		}
		
		for (String word : set) {
			System.out.print(word+" ");
		}
	}

}
