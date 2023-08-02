package Test;

import java.util.Scanner;

public class _1462 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 1;
		int sum = 1;
		int arr[][] = new int[n][n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i][0] = a++;
			for (int j = 1; j < arr[i].length; j++) {
				sum = sum + 3; 
				arr[i][j] = sum;
			}
			sum = a;
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