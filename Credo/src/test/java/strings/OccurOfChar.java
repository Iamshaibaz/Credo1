package strings;

public class OccurOfChar {
	
	public static void main(String[] args)
	{
		
		String str = "Welcome to javatpoint portal";
		int count = 0 ;
		char ch = 0;
		
		for(int i = 0  ;i<=str.length()-1;i++)
		{
			if(str.charAt(i)=='t')
			{
				ch = str.charAt(i);
				count ++;
				
			}
			
		}System.out.println(count+" times "+ch+" printed " );

}
}
