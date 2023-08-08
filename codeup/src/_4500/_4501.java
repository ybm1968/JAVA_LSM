package _4500;

import java.util.Scanner;

public class _4501 {

	public static void main(String[] args) {
		int arr[] = new int[7];
		
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 1; i < 3; i++) {
			for (int j = 0; j < arr.length-i; j++) {
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;				
				}
			} 
		}
		
		for (int i = 6; i > 4 ; i--) {
			System.out.println(arr[i]);
		}
		
		sc.close();
	}
}
