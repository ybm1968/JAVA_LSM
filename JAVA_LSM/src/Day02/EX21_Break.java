package Day02;

import java.util.Scanner;

public class EX21_Break {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("입력 : ");
			String str = sc.nextLine();
			
			if (str.equals("STOP")) // 문자열.eqauls("비교문자열") 
				break;				// : 문자열이 비교문자열과 일치하는지 여부를 알려주는 메소드
			
			System.out.println(">> " + str);
		}
		System.out.println("프로그램을 종료합니다.");
		sc.close();
	}
}
