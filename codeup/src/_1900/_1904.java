package _1900;

import java.util.Scanner;

public class _1904 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		aTob(a, b);
		
		sc.close();
	}

	public static void aTob(int a, int b) {		
		if (a % 2 == 1) {
			System.out.println(a + " ");
		}
		
		if ( a == b ) return;
		
		aTob(++a, b);
	}
	
}
