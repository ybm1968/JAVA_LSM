package _2000;

import java.util.Scanner;

// 아메리카노
public class _2009 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();
		int count = 0;
		
		while ( k >= n ) {
			k = k - n + 1;
			count++;
		}
		System.out.println(count);
		
		sc.close();
	}
}
