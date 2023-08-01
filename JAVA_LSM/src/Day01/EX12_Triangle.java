package Day01;

import java.util.Scanner;

public class EX12_Triangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("삼각형의 넓이");
		System.out.print("밑변 : ");
		double width = sc.nextDouble();
		
		System.out.print("높이 : ");
		double height = sc.nextDouble();
		
		double area = width * height / 2;
		System.out.println("넓이 : " + area);
		
		sc.close();
	}
}
