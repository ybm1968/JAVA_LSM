package _1900;

import java.util.Scanner;

public class _1953 {
	
	static String str = "";
	
	public static void method(int n) {
		if( n == 0 ) return;
		str += "*";
		System.out.print(str);
		System.out.println();
		method(n-1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		method(n);
		
		sc.close();
	}

}
