package _1900;

import java.util.Scanner;

public class _1912 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(nFactorial(n));
		
		sc.close();
	}
	
	public static int nFactorial(int n) {
		
		if(n > 1)
			return nFactorial(n-1) * n;
		else
			return 1;
		
	}

}
