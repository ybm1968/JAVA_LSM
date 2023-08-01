package Day02;

public class EX15_OddEven {
	public static void main(String[] args) {
		// 1 ~ 20 까지의 정수 중, 홀수의 합 짝수의 합을 각각 구하시오.
		
		int odd = 0;
		int even = 0;
		int i = 1;
		
		while (i <= 20)	{
			if (i % 2 == 0) {
				even += i++;
			}
			else {
				odd += i++;
			}
			// i++;
		}
		System.out.println("홀수의 합 : " + odd);
		System.out.println("짝수의 합 : " + even);
		
	}
}
