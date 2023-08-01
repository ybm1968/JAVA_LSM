package Day05.EX01_StaticMember;

class Calculator {
//	1. 절댓값
	public static int abs(int val) {
		return val > 0 ? val : -val;
	}

//	2. 최댓값
	public static int max(int arr[]) {
		int max = Integer.MIN_VALUE;
		for (int a : arr) {
			if (max < a)
				max = a;
		}
		return max;
	}

//	3. 최솟값
	public static int min(int arr[]) {
		int min = Integer.MAX_VALUE;
		for (int a : arr) {
			if (min > a)
				min = a;
		}
		return min;
	}
}

public class StaticCalculator {
	public static void main(String[] args) {
		int[] arr = { 70, 90, 85, 50, 100 };

		// 다른 클래스의 static 메소드를 호출할 떄는 클래스.메소드명() 형태로 메소드를 호출한다.
		System.out.println("abs(-123) : " + Calculator.abs(-123));
		System.out.println("max(arr) = " + Calculator.max(arr));
		System.out.println("min(arr) = " + Calculator.min(arr));
		
	}
}
