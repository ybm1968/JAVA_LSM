package Day03;

import java.util.Scanner;

public class EX03_Min {
	public static void main(String[] args) {
		// 첫째 줄에 입력할 개수 n 입력받고
		// 둘쨰 줄에 n개의 정수를 공백을 두고 입력
		// n개의 정수 중, 최솟값을 구하여 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int tmp = arr[0]; // int tmp = Integer.MAX_VALUE;
		
		for (int i = 1; i < n; i++) {
			
			if (tmp > arr[i]) {
				tmp = arr[i];
			}
		}
		System.out.println("최솟값 : " + tmp);
		
		sc.close();
	}
}
