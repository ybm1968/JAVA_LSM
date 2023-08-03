package _1000;

import java.util.Scanner;

public class _1066 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		String s1 = a % 2 == 0 ? "even" : "odd";
		String s2 = b % 2 == 0 ? "even" : "odd";
		String s3 = c % 2 == 0 ? "even" : "odd";
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
