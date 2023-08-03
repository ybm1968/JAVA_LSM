package _1200;

import java.util.Scanner;

public class _1207 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		int a3 = sc.nextInt();
		int a4 = sc.nextInt();
		
		int sum = a1 + a2 + a3 + a4;
		
		if (sum == 4) {
			System.out.println("윷");
		} 
		else if (sum == 3) {
			System.out.println("걸");
		}
		else if (sum == 2) {
			System.out.println("개");
		}
		else if (sum == 1) {
			System.out.println("도");
		}
		else if (sum == 0) {
			System.out.println("모");
		}
		
		sc.close();
	}

}
