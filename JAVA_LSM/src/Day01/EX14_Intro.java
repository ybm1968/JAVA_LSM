package Day01;

import java.util.Scanner;

public class EX14_Intro {
	public static void main(String[] args) {
		System.out.println("이름, 나이, 키, 주소를 공백을 두고 입력해보세요");
		
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next();
		System.out.println("이름 : " + name);
		
		int age = sc.nextInt();
		System.out.println("나이 : " + age);
		
		double height = sc.nextDouble();
		System.out.println("키 : " + height);
		
		String address = sc.nextLine();
		System.out.println("주소 : " + address);
		
		sc.close();
	}

}
