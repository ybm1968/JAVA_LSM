package Day02;

public class EX05_TernaryOperator {
	public static void main(String[] args) {
		int a = 3, b = 5;
		
		int result = (a > b) ? a-b : b-a;
		
		System.out.println("두 수의 차이 : " + result);
	}
}
