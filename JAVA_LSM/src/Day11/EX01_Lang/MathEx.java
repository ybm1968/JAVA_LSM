package Day11.EX01_Lang;

public class MathEx {

	public static void main(String[] args) {
		System.out.println(Math.PI);
		System.out.println(Math.ceil(3.125));		// 올림 : 해당 수보다 큰 정수 중 가장 작은수
		System.out.println(Math.floor(3.75));		// 내림 : 해당 수보다 작은 정수 중 가장 큰수
		System.out.println(Math.sqrt(9));			// 제곱근(루트)
		System.out.println(Math.pow(3, 2));			// 3의 2제곱
		System.out.println(Math.exp(2));	 		// e의 2승
		System.out.println(Math.round(3.14));  		// 반올림
		
		System.out.println("-----------------------------");
		
		// 로또 번호 6/45
		// [1, 45] 사이의 정수형 난수 6개 만들기
		// Math.random()					: 0.0 보다 크거나 같고 1.0 보다 작은 임의의 실수
		// Math.random()					: 0.XXXX ~ 0.9XXXX
		// (0.XXX ~ 0.9XX) * 10 			: 0.XXXX ~ 9.XXX (0 ~ 9) - 10개
		// (0.XXX ~ 0.9XX) * 20 			: 0.XXXX ~ 19.XXX (0 ~ 19) - 20개
		// (0.XXX ~ 0.9XX) * 45 			: 0.XXXX ~ 44.XXX 
		// (0.XXX ~ 0.9XX) * 45 + 1 		: 1.XXXX ~ 45.XXX 
		// (int)(Math.random() * 45 + 1) 	: 1 ~ 45
		
		// 공식
		// (int)(Math.random() * 개수 + 시작숫자)
		
		for (int i = 0; i < 6; i++) {
			int random = (int)(Math.random() * 45 + 1);
			System.out.print(random + " ");
		}
		System.out.println();
		
		// -50 ~ 50 사이의 랜덤 정수 1개를 출력하시오
		// 0 < random() < 1
		// 0 < random() * 101 < 101
		// -50 < random() * 101 - 50 < 51
		int random = (int)(Math.random() * 101 - 50);
		System.out.println(random);
		
		System.out.println("-----------------------------");
		
		double arr[] = {98.45, 65.33, 44.45, 85.12, 70.45};
		double max = Double.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			max = Math.max(max, arr[i]);
		}
		
		System.out.println("max : " + max);
	}
}
