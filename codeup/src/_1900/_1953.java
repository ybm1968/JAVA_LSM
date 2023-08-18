package _1900;

import java.util.Scanner;

public class _1953 {
	
	public static void method(int n) {
		//method(n);
		if( n == 0 ) return;
		method(n-1);
		System.out.print("*");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		method(n);
	}
}
