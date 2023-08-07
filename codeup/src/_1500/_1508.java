package _1500;

import java.util.Scanner;

/*
 	순서도
 	1. 정수 n을 입력받는다.
 	2. n행n열의 2차원배열을 생성한다.
 	3. n번 반복하여 n개의 정수를 배열 1열에 순서대로 값을 대입한다.
 	4. 
 		배열을 아래의 반복변수 i, j로 반복하여
 		i : 1 ~ n-1
 		j : 1 ~ i
 		arr[i][j] = arr[i][j-1] - arr[i-1][j-1]
 		수식으로 연산하여 ?(빈칸)에 값을 대입한다
 	5. 배열을 반복하여, 값이 있는 삼각형의 모양의 부분만 출력한다.	
 */


public class _1508 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	
		int[][] ary = new int[n][];
		
		for (int i = 0; i < ary.length; i++) {
			ary[i] = new int[i+1];
			ary[i][0] = sc.nextInt();
		}
		
	
		for (int i = 1; i < ary.length; i++) {
			for (int j = 1; j < ary[i].length; j++) {
				ary[i][j] = ary[i][j-1] - ary[i-1][j-1];
			}
		}
		
		for (int i = 0; i < ary.length; i++) {
			for (int j = 0; j < ary[i].length; j++) {
				System.out.print(ary[i][j] + " ");
			}
			System.out.println();
		}
		
		
		sc.close();
	}

}
