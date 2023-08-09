package _1100;

import java.util.Scanner;

// min이 30 이상이면 min - 30
// min이 30 이하이면 min + 30 and hour - 1
 
public class _1173 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int min = sc.nextInt();
		
		if( min >= 30) {
			min = min - 30;
		}
		else {
			
		}
		
		sc.close();
	}
}
