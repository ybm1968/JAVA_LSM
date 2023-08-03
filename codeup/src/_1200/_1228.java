package _1200;

import java.util.Scanner;

public class _1228 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키를 입력하시오 : ");
		double height = sc.nextDouble();
		
		System.out.print("몸무게를 입력하시오 : ");
		double weight = sc.nextDouble();
		
		double avgweight = (height - 100) * 0.9;
		double bmi = (weight - avgweight) * 100 / avgweight;
		
		if (bmi <= 10) {
			System.out.println("정상");
		}
		else if (bmi <= 20 && bmi > 10) {
			System.out.println("과체중");
		}
		else {
			System.out.println("비만");
		}
		
		sc.close();
	}
}
