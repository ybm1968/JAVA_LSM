package Day05.Review;

import java.util.Scanner;

public class EX06_Matrix {
	public static void main(String[] args) {
		// 양의 정수 M과 N을 입력받아 저장하고
		// M행 N열의 2차원배열을 생성한다.
		
		Scanner sc = new Scanner(System.in);
		int M, N, X, Y;
		System.out.print("M : ");
		M = sc.nextInt();
		System.out.print("N : ");
		N = sc.nextInt();
		
		int arr[][] = new int[M][N];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		// X행Y열 2차원 배열을 생성하고 순서대로 값을 입력받아 그대로 출력
		// 출력시 foreach문을 사용
		System.out.print("X : ");
		X = sc.nextInt();
		System.out.print("Y : ");
		Y = sc.nextInt();
		
		int ary[][] = new int[X][Y];
		
		for (int i = 0; i < ary.length; i++) {
			for (int j = 0; j < ary[i].length; j++) {
				ary[i][j] = sc.nextInt();
			}
		}
		
		for (int[] row : ary) {
			for (int col : row) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
