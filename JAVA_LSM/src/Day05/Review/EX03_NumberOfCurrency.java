package Day05.Review;


import java.util.Scanner;

/*
 *  화폐 매수 구하기
 *  
 *  금액 		: 537620
 *  50000 	: 10개
 *  10000 	: 3개
 *  5000 	: 1개
 *  1000 	: 2개
 *  500 	: 1개
 *  100 	: 1개
 *  50 		: 0개
 *  10 		: 2개
 *  5 		: 0개
 *  1 		: 0개
 *  위와 같이 금액을 입력하면, 큰 화폐단위부터 계산하여, 화폐단위별로 화폐매수를 출력하는 프로그램
 */
public class EX03_NumberOfCurrency {
	
	/*
	 * (순서도)
	 * 1. 필요한 변수 선언 
	 * - 입력금액, 화폐매수, 화폐단위
	 * 2. 입력금액 입력
	 * 3. 화폐매수 계산
	 * [조건] : 큰 화폐단위부터 계산
	 * 3-1. 화폐매수 계산
	 * 화폐매수 = 입력금액 / 화폐단위
	 * 
	 * 3-2 잔액 계산
	 * 잔액 = 입력금액 - (화폐단위 * 화폐매수)
	 * 잔액 = 입력금액 % 화폐단위
	 * 
	 * 3-3. 화폐단위 변환
	 * - 번갈아가면서 /5, /2 연산을 반복한다
	 * 화폐단위 = 화폐단위 / 5
	 * 화폐단위 = 화폐단위 / 2
	 * 
	 * 4. 3번의 과정을 반복
	 * - 반복조건 : 화폐단위가 1보다 크거나 같은면 반복
	 * 5. 3-1에서 구한 화폐매수를 출력
	 */
	
	public static void main(String[] args) {
		int input; 						// 입력금액
		int count;						// 화폐매수
		int money = 50000;				// 화폐단위
		boolean sw = true;				// 화폐단위 전환하는 변수
		
		Scanner sc = new Scanner(System.in);
		System.out.print("금액 : ");
		input = sc.nextInt();
		
		while(money >= 1) {
			count = input / money;
			System.out.println(money + "\t : " + count + " 개");
			
			// input = input - (money * count); 잔액계산
			input = input % money;				
			
			if(sw) {
				money = money / 5;
				// sw = false;
			}
			else {
				money = money / 2;			
				// sw = true;
			}
			sw = !sw;	
		}
		
		sc.close();
		
//		int n = sc.nextInt();
//		int m;
//		int[] a = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
//		
//		for (int i = 0; i < a.length; i++) {
//			m = n / a[i];
//			n = n % a[i];
//			System.out.print(a[i] + "원 \t: " + m + "개");
//			System.out.println();
//		}	
		
	}
	
}
