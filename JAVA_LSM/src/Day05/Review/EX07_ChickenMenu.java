package Day05.Review;

import java.util.Scanner;

/*
  ###### 메뉴판 ######
  1. 굽네치킨 - 볼케이노 치킨
  2. BBQ - 황금올리브 반반 치킨
  3. 교촌 - 허니콤보 치킨
  4. BHC - 뿌링클 치킨
  5. 레드락 - 양념치킨
  0. 종료
  ###### 입력 :
  
  메뉴번호에 따라 메뉴 변수에 해당메뉴를 저장해주고
  "(해당메뉴) 이 주문되었습니다." 라고 출력
  0을 입력하기 전까지 반복하고, 0을 입력하면 종료
  종료 시, "?개의 주문을 완료합니다." 라고 출력
 */

public class EX07_ChickenMenu {

	public static void main(String[] args) {
		int count = 0;
//		String menu = "";
		int n;
		Scanner sc = new Scanner(System.in);
		
		do {
//			System.out.println("#### 점심 메뉴판 ####");
//			System.out.println("1. 굽네치킨 - 볼케이노 치킨");
//			System.out.println("2. BBQ - 황금올리브 반반 치킨");
//			System.out.println("3. 교촌 - 허니콤보 치킨");
//			System.out.println("4. 라면BHC - 뿌링클 치킨");
//			System.out.println("5. 레드락 - 양념치킨");
//			System.out.println("0. 종료");
//			System.out.print("##### 입력 : ");
			
//			switch (n) {
//			case 1: menu = "굽네치킨 - 볼케이노 치킨"; break;
//			case 2: menu = "BBQ - 황금올리브 반반 치킨"; break;
//			case 3: menu = "교촌 - 허니콤보 치킨"; break;
//			case 4: menu = "라면BHC - 뿌링클 치킨"; break;
//			case 5: menu = "레드락 - 양념치킨"; break;				
//			}
		
			showMenu();
			n = sc.nextInt();	
			if(n == 0) break; 
			
			if(n >= 1 && n <= 5) {
				System.out.println(choiceMenu(n) + "이 주문되었습니다.");
				System.out.println();
				count++;
			}
		} while (true);
		System.out.println(count + "개의 주문을 완료합니다.");
		sc.close();
	}
	
	public static void showMenu() {
		System.out.println("#### 점심 메뉴판 ####");
		System.out.println("1. 굽네치킨 - 볼케이노 치킨");
		System.out.println("2. BBQ - 황금올리브 반반 치킨");
		System.out.println("3. 교촌 - 허니콤보 치킨");
		System.out.println("4. BHC - 뿌링클 치킨");
		System.out.println("5. 레드락 - 양념치킨");
		System.out.println("0. 종료");
		System.out.print("##### 입력 : ");
	}
	
	public static String choiceMenu(int n) {
		String menu = "";
		
		switch (n) {
		case 1: menu = "굽네치킨 - 볼케이노 치킨";  break;
		case 2: menu = "BBQ - 황금올리브 반반 치킨";  break;
		case 3: menu = "교촌 - 허니콤보 치킨";  break;
		case 4: menu = "BHC - 뿌링클 치킨";  break;
		case 5: menu = "레드락 - 양념치킨";  break;				
		}
		return menu;
	}
}
