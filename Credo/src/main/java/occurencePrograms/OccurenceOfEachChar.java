package occurencePrograms;

import java.util.LinkedHashSet;


public class OccurenceOfEachChar {
	public static void main(String[] args) {
		
		String s1 = "helloworld";
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		for(int i =0 ; i< s1.length();i++) {
			set.add(s1.charAt(i));
			
		}
		for(Character ch : set)
		{
			int count=0;
			for(int i = 0 ; i<s1.length();i++) {
				if(ch==s1.charAt(i)) {
				count++;
				}
			}
			
			System.out.println(ch +" times printed: " +count );
		}
	
		
	}
	
	

}
