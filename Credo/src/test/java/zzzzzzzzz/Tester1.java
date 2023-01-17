package zzzzzzzzz;

import java.util.Random;

public class Tester1 {
	public static void main(String[] args)
	{
		System.out.println(generatePassword(8));
	}
	private static char[] generatePassword(int length)
	{
		
		String caps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smal = "abcdefghijklmnopqrstuvwxyz";
		String num = "1234567890";
		String spe = "!%#@";
		String combine = caps+smal+num+spe;
		Random random = new Random();
		char[] password = new char[length];
		
		password[0] = caps.charAt(random.nextInt(caps.length()));
		password[1] = smal.charAt(random.nextInt(smal.length()));
		password[3] = num.charAt(random.nextInt(num.length()));
		password[4] = spe.charAt(random.nextInt(spe.length()));
		
		for(int i = 4;i< length;i++)
		{
			password[i] = combine.charAt(random.nextInt(combine.length()));
		}
		return password;
	}

}

