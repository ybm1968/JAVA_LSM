package _1400;

import java.util.Scanner;

public class _1468 {
	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 1;
		
		int arr[][] = new int[n][n];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i % 2 == 0) {
					arr[i][j] = a++;
				} else {
					arr[i][n-j-1] = a++;
				}
			}
		}
	
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " "); 
			}
			System.out.println();
		}
		sc.close();
	}
}
