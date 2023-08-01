package Day05.Review;

public class EX04_Lotto {
	public static void main(String[] args) {
		// int random = (int) (Math.random() * 45 +1);
		
		// 1 ~ 20 사이의 랜덤수
		// int rand1 = (int) (Math.random() * 20 + 1);
		// System.out.println(rand1);
		
		
		// -20 ~ 20 사이의 랜덤수
		// int rand2 = (int) (Math.random() * 41 - 20);
		// System.out.println(rand2);
		
		int lotto[] = new int[6];
		for (int i = 0; i < 6; i++) {
			int num = (int)(Math.random() * 45 + 1);
			lotto[i] = num;
			// 중복제거
			for(int j = 0; j < i; j++) { 
				if (num == lotto[j]) i--;
			}
		}
		
		// 오름차순 정렬
		// 1. i번쨰 요소를 선택, 나머지 요소들과 비교
		// 2. 선택요소 > 비교요소 -> 교환
		for (int i = 0; i < lotto.length-1; i++) {
			for (int j = i+1; j < lotto.length; j++) {
				if(lotto[i] > lotto[j]) {
					int tmp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = tmp;
				}
			}
		}
		
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println();
	}
}
