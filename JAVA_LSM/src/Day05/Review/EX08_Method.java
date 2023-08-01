package Day05.Review;

import java.util.Scanner;

public class EX08_Method {
	
	public static int plus(int a, int b) {
		int result = a + b;
		return result;
	}

	public static int minus(int a, int b) {
		int result = a - b;
		return result;
		// return (값);
		// 1. 값을 메소드 호출한 차지로 반환
		// 2. 메소드 종료
		// 3. 메모리 해제
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a : ");
		int a = sc.nextInt();
		System.out.print("b : ");
		int b = sc.nextInt();
		
		System.out.println(plus(a, b));
		System.out.println(minus(a, b));
		
		sc.close();
	}
}

