package _1100;

import java.util.Scanner;

// min이 30 이상이면 min - 30
// min이 30 미만이면 min + 30 and hour - 1
// 30분 전 
public class _1173 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int min = sc.nextInt();
		
		if( min >= 30) {
			min = min - 30;
		}
		else {
			min = min + 30;
			
			if(hour == 0)
				hour = 23;
			else 
				--hour;
				
			
		}
		
		System.out.println(hour + " " + min);
		
		sc.close();
	}
}
