package Day02;

import java.util.Scanner;

public class EX10_Switch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("채널을 선택하세요 : ");
		int channel = sc.nextInt();
		
		// switch : ctrl + space
		switch (channel) {
		case 11:	
			System.out.print("MBC - 나혼자산다");
			break;
		case 15:
			System.out.print("JTBC - 킹더랜드");
			break;
		case 1:
			System.out.print("NETFLIX - 하트시그널");
			break;
		case 2:
			System.out.print("디즈니플러스 -");
			break;
		case 3:
			System.out.print("쿠팡플레이 -");
			break;
		case 27:
			System.out.print("Mnet");
		default:
			System.out.print("유요한 채널번호를 입력하세요.");
			break;
		}
		sc.close();
	}
}
