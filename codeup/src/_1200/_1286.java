package _1200;

import java.util.Scanner;

// 최댓값, 최솟값
public class _1286 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] n = new int[5];
		int max;
		int min;
		
		for (int i = 0; i < n.length; i++) {
			n[i] = sc.nextInt();
		}
		
		max = n[0];
		min = n[0];
		for (int i = 1; i < n.length; i++) {
			if(max < n[i]) {
				int tmp = n[i];
				n[i] = max;
				max = tmp;
			}
			if(min > n[i]) {
				int tmp = n[i];
				n[i] = min;
				min = tmp;
			}
		}
		
		System.out.println(max);
		System.out.println(min);
		
		sc.close();
	}
}
