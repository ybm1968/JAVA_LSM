package Day01;

import java.util.Scanner;

public class Ex13_Circle {
	public static void main(String[] args) {
		// 상수 선언시, 반드시 값을 초기화해야한다.
		// 선언 후에 값을 변경하면 에러가 발생한다.
		final double PI = 3.141592;
		Scanner sc = new Scanner(System.in);
		// 바로 엔터 : shift + enter
		System.out.print("반지름 : ");
		double radius = sc.nextDouble();
		double area = PI * radius * radius;
		
		System.out.println("원의 넓이 : " + area);
		sc.close();
	
	}
}
