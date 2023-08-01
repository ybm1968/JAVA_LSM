package Day05.Review;

import java.util.Scanner;

public class EX01_Multiple {
	public static void main(String[] args) {
		// 정수를 하나 입력받아서
		// 입력 받은수가 3의 배수인지 판단 여부 출력
		// 3의 배수 O : 3의 배수입니다.
		// 3의 배수 X : 3의 배수가 아닙니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 : ");
		int n = sc.nextInt();
		
		if(n % 3 == 0) {
			System.out.println("3의 배수입니다.");
		}
		else {
			System.out.println("3의 배수가 아닙니다.");
		}
		sc.close();
	
	}
}
