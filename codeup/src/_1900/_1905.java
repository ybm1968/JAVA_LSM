package _1900;

import java.util.Scanner;

public class _1905 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	
		
		System.out.println(oneToNSum(n));
		
		sc.close();
	}
	
	public static int oneToNSum(int n) {	
		if(n > 1)
			return oneToNSum(n-1) + n;
		else
			return 1;
	}

}
