package Day02;

import java.util.Scanner;

public class EX09_Nested {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학년 : ");
		int year = sc.nextInt();
		
		System.out.print("점수 : ");
		int score = sc.nextInt();
		
		if (year == 4) {
			if (score >= 60) {
				System.out.println("합격");
			} 
			else {
				System.out.println("불합격");
			}
		} 
		else {
			System.out.println("응시자격 요건에 해당되지 않습니다.");
		}
		
		
		
		
		if ( year == 4 && score >= 60) {
			System.out.println("합격");
		}
		
		if ( year == 4 && score < 60) {
			System.out.println("불합격");
		}
		
		if (year != 4) {
			System.out.println("응시자격 요건에 해당되지 않습니다.");
		}
		sc.close();
	}
}
