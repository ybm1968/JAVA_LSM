package Day02;

public class EX14_WhileSum {
	public static void main(String[] args) {
		// 1부터 100까지 합계
		
		int i = 1;
		int sum = 0;
		
		while (i <= 100) {
			sum += i++;
		}
		System.out.println(sum);
	}
}
