package Day01;

import java.util.Scanner;

public class EX04_inputDouble {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("x : ");
		int x = sc.nextInt();
		
		System.out.print("y : ");
		int y = sc.nextInt();
		
		System.out.print("z : ");
		int z = sc.nextInt();
		
		int sum = x + y + z;
		double avg = (double)sum / 3;	// 강제 형변환
		// (double) / (int) : (double)
		// 서로다른 자료형 연산 시, 결과는 큰 자료형으로 반환된다.
		// 큰 자료형 + 작은 자료형 = 큰 자료형
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		
		sc.close();
	}
}
