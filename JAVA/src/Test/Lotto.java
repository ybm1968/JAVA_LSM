package Test;

import java.util.Scanner;

public class Lotto {
	public static void main(String[] args) {		
		// Math.random() : 0.XXXX ~ 0.9XXXX 사이의 임의 수를 반환 (1보다 작은수)
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arry = new int[6];
			
		for (int i = 1; i <= n ; i++) {
			System.out.print("[" + i + "]게임 : ");
			uniquArray(arry);
			orderBy(arry);
			for (int j = 0; j < arry.length; j++) {
				System.out.print(arry[j] + " ");
			} System.out.println();
		}
		
		sc.close();
	}
	
	// 중복제거
	public static int[] uniquArray(int[] arry) {
		for (int i = 0; i < arry.length; i++) {
			arry[i] = (int)(Math.random() * 45 + 1);
			for (int j = 0; j < i; j++) {
				if(arry[i] == arry[j]) {
					i--;
				}
			} 
		}
		return arry;
	}
	
	// 오름차순
	public static int[] orderBy (int[] arry) {
		int MIN;
		
		for (int i = 0; i < arry.length-1; i++) {
			for (int j = i+1; j < arry.length; j++) {
				if (arry[i] > arry[j]) {
					MIN = arry[j];
					arry[j] = arry[i];
					arry[i] = MIN;
				} 
			}
		}
		return arry;
	}
}






