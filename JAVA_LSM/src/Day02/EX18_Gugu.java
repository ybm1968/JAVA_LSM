package Day02;

import java.util.Iterator;
import java.util.Scanner;

public class EX18_Gugu {
	public static void main(String[] args) {
		// 구구단 출력 : 원하는 단을 입력받아 구구단 수식을 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int input = sc.nextInt();
		
		for (int i = 1; i <= 9; i++) {
			int result = input * i;
			System.out.println(input + "*" + i + "=" + result);
		}
		sc.close();	
	}
}
