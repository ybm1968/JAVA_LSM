package Day02;


import java.util.Scanner;

public class EX12_SwitchBreak {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		
		int result = num % 5;
		
		switch (result) {
		case 0:
		case 1: System.out.println("*");
				break;
		case 2:
		case 3:
		case 4:
				System.out.println("**");
				break;
		}
		sc.close();
	}
}
