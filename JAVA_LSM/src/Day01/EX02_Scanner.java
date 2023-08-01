package Day01;

import java.util.Scanner;

public class EX02_Scanner {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a : ");
		int a = sc.nextInt();
		
		System.out.println("a : " + a);
		// 숫자(int) 자료형이 문자열 자료형으로 변환되어 연결된다.
		
		
		sc.close(); 
		// Scanner 객체를 메모리에사 해제하는 메소드
		// Scanner 객체가 닫힌 후에는 입력을 할 수 없다.
	}
}
