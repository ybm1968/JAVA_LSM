package Day11.EX02_Util;

import java.util.Random;

public class RandomEx {

	public static void main(String[] args) {
		Random random = new Random();
		
		// nextInt() 			: int 랜덤수(난수)를 반환하느 메소드
		// nextBoolean() 		: boolean 랜덤수(난수)를 반환하느 메소드
		// nextDouble() 		: double 랜덤수(난수)를 반환하느 메소드
		
		boolean randomTF = random.nextBoolean();
		System.out.println(randomTF);
		
		// 동전 던지기
		System.out.println("동전 던집니다.");
		
		// true : 앞 false : 뒤
		if(randomTF) System.out.println("앞면");
		else System.out.println("뒷면");
		
		// 4byte 범위 : (-21억xxx ~ 21억xxx) 사이의 난수를 반환
		int fourByteRandom = random.nextInt();
		System.out.println("4바이트 랜덤 정수 : " + fourByteRandom);
		
		// nextInt(N) 					: (0 ~ N-1) 사이의 난수를 반환
		// random.nextInt(6)			: (0 ~ 5)
		// random.nextInt(6) + 1		: (1 ~ 6)
		// 공식
		// random.nextInt(개수) + 시작숫자
		int dice = random.nextInt(6) + 1;			// 1 ~ 6 랜덤수
		System.out.println("주사위 : " + dice);
		
		int lotto = random.nextInt(45) + 1;			// 1 ~ 45 랜덤수
		System.out.println("로또번호 : " + lotto);
		
		double randomDouble = random.nextDouble();
		System.out.println("실수 랜덤 수 : " + randomDouble);
		
	}
}
