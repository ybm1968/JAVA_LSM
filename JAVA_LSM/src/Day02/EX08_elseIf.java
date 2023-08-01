package Day02;

import java.util.Scanner;

public class EX08_elseIf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 : ");
		int score = sc.nextInt();
		String result = "";
		
		if (score >= 90) 
			result = "A";
		else if (score >= 80)
			result = "B";
		else if (score >= 70)
			result = "C";
		else if (score >= 60)
			result = "D";
		else 
			result = "F";
		
		System.out.println("학점은 " + result + " 입니다.");
		sc.close();
	}
}
