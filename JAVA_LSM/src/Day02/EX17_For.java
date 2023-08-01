package Day02;

public class EX17_For {
	public static void main(String[] args) {
		// 1 ~ 10 까지의 정수를 출력
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 50 ~ 100 까지의 정수를 출력
		for (int i = 50; i <= 100; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 1 ~ 20 까지 짝수만 출력
		System.out.print("짝수 : ");
		for (int i = 2; i <= 20; i+=2) {
				System.out.print(i + " ");
		}
		System.out.println();
		
		// 1 ~ 20 까지 홀수만 출력
		System.out.print("홀수 : ");
		for (int i = 1; i <= 20; i+=2) {
				System.out.print(i + " ");
		}
	}
}
