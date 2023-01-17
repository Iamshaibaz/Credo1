package occurenceChar;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDupString {

	public static void main(String[] args)
	{
		String s="india";
		//step 1 create any type of set collection and add all  the characters of the 
		// given string 
		//to get output in sorted order,use linkedhashset
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i =0;i<s.length();i++)
		{
			set.add(s.charAt(i));
			
		}
		//step 2 compare each character of set with all character of the given
		//string 
		for(Character ch:set)
		{   int count=0;
		//compare with each char and increase count
			for(int i=0;i<s.length();i++)
			{
				if(ch==s.charAt(i)){
					count++;
				}
				if(ch==s.charAt(count))
				{
					count++;
					
				}
				if(count==1)
				{
					System.out.println();
				}
				
			}//step3 print both char of set and count
			//if(count==1) //this statement for printing only duplicates //if you want unique characters count==1
		//	System.out.print(ch);
			
		}
	}
}
