package egm;

import java.util.LinkedHashSet;

public class OccuranceOfChar {
	
	public static void main(String[] args)
	{
		String s = "india";
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		for(int i =0;i<s.length()-1;i++)
		{
			set.add(s.charAt(i));
			
		}
		for(Character ch : set)
		{
			int count=0;
			for(int i = 0 ; i<s.length();i++)
			{
				if(ch==s.charAt(i))
				{
					count ++;
				}
				
			}

			System.out.println(ch+ " count = "+ count);
		}
		
	}
	

}
