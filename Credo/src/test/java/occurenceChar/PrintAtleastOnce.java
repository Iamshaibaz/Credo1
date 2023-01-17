package occurenceChar;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class PrintAtleastOnce {

	public static void main(String[] args)
	{
		String s="india";
		//step 1 create any type of set collection and add all  the characters of the 
		// given string 
		//to get output in sorted order,use linked hash set
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
				
			}//step3 print both char of set and count
		//this statement for printing only duplicates //if you want unique characters count==1
		
		System.out.println(ch+" printing "+count+" times ");
		}
	}
}
