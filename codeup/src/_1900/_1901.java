package _1900;

import java.util.Scanner;

public class _1901 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		oneToN(n);
		
		sc.close();
	}

	public static void oneToN(int n) {
	
		if(n == 0) return;
		
		oneToN(n-1);					// oneToN(--n); 
		System.out.println(n);			// System.out.println(n+1);
	}									// --n하면 1이감소해서 n의값이 변함 
										// n-1하면 n값에 변화 없음
	
	
}

