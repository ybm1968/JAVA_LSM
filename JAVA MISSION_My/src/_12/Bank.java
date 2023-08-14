package _12;

import java.util.Scanner;

public class Bank {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void accountRegistration() {
//		System.out.print("계좌번호>> ");
//		accountNumber = sc.nextLine();
//
//		System.out.print("예금주>> ");
//		accountHolder = sc.nextLine();
//
//		System.out.print("최초예금액>> ");
//		balance = sc.nextInt();
//		sc.nextLine();
//
//		System.out.print("비밀번호>> ");
//		adminPassword = sc.nextLine();
	}
	
	public void deposit() {
		
	}
	
	public void withdraw() {
		
	}
	
	public void accountInquiry() {
		
	}
	
	public void accountList() {
		
	}
	
	public static void main(String[] args) {
		Account[] accountList = new Account[1000];
		int no;
//		String accountNumber;		// 계좌번호
//		String accountHolder;		// 예금주
//		int balance;				// 예금잔액
//		String adminPassword;		// 비밀번호
		
		
		
		do {
			System.out.println("======================");
			System.out.println("1. 계좌등록");
			System.out.println("2. 입금");
			System.out.println("3. 출금");
			System.out.println("4. 계좌조회");
			System.out.println("5. 계좌목록");
			System.out.println("6. 종료");
			System.out.print("입력>> ");
			no = sc.nextInt();
			sc.nextLine();
			
			Account account;
			

			if(no == 6) break;
			
			switch (no) {
			case 1:
				//accontList = new 
				break;

			default:
				break;
			}
		
		} while(true);
	}

}
