package Day03;

public class EX01_Array {
	public static void main(String[] args) {
		// 배열 선언
		int arr[];
		
		// 배열 생성
		arr = new int[5];
		
		// 배열 요소에 접근
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		// 배열의 길이 : 배열 요소의 개수 = 배열.length
		int n = arr.length;
		System.out.println("배열의 길이 : " + n);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
	}
}
