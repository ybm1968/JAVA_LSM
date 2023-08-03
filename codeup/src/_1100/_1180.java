package _1100;

import java.util.Scanner;

public class _1180 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ten = n / 10;
		int one = n % 10;
		
		n = 2 * ((one * 10) + ten);
		
		if (n > 100) {
			n = n % 100;
		}
		
		System.out.println(n);
		
		if (n <= 50) {
			System.out.println("GOOD");
		} 
		else {
			System.out.println("OH MY GOD");
		}
		
		sc.close();
	}
}
