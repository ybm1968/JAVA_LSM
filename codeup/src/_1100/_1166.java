package _1100;

import java.util.Scanner;

// 윤년판별
public class _1166 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if (num % 400 == 0) {
			System.out.println("Leap");
		}
		else if( (num % 4 == 0) && (num % 100 != 0) ) {
			System.out.println("Leap");
		}
		else
			System.out.println("Normal");
		
		sc.close();
	}
}
