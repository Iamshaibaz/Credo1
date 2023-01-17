package revisionPrograms.reverseStringWithWithoutLengthKeyword;

public class ReverseString1 {
	public static void main(String[] args)
	{
		String s1 = "kingkhan";
		String rev = "";
		int count = 0;
		//First store reverse string in rev_Variable
		char[] a = s1.toCharArray();
		for(char ch: a ) {
			System.out.print(ch);
			count++;
		}
		for(int i = count -1; i>=0;i--) {
			rev = rev+s1.charAt(i);
		}
		System.out.println("\n");
		System.out.println(rev);
	}

}
