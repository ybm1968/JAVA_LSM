package _1900;

import java.util.Scanner;

public class _1902 {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			
			oneToN(n);
			
			sc.close();
		}

		public static void oneToN(int n) {
		
			System.out.println(n);
			
			if(n == 1) return;
			
			oneToN(n-1);
		}
		
	
	}

