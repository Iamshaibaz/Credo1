package bookPrograms;

public class A5PrimePNumber {
	
	public static void main(String[] args) {
		int n = 7;
		int temp = 0;
		for(int i = 2 ; i <= n-1; i ++ ) {
			if(n%i == 0) {
				temp  = temp + i;
			}
		}
		if(temp < 1) {
			System.out.println(" it is prime : " + n);
		}
		else
		{
			System.out.println(" not a prime: " + n);
		}
	}

}
