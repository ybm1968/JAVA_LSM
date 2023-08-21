package _1200;

import java.util.Scanner;

// 7   ----> 1   (1자릿수)
//
// 10  ----> 2   (2자릿수)
//
// 4322 ----> 4   (4자릿수)
//
// 자리수 계산
public class _1278 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		int tmp = 1;

		while ( tmp != 0 ) {
			tmp = n / 10;
			n = tmp;
			count++;
		}
		System.out.println(count);
		
		sc.close();
	}
}
