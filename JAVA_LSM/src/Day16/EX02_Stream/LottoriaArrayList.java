package Day16.EX02_Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LottoriaArrayList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 게임? ");
		int n = sc.nextInt();
		
		// 랜덤 수 6개를 한 게임에 넣어줌
		for (int i = 0; i < n; i++) {
			System.out.print("[" + (i+1) + "] 게임 : ");
			ArrayList<Integer> lottoList = new ArrayList<Integer>();
			
			// 랜덤수 6개를 한 게임에 넣어줌
			for (int j = 0; j < 6; j++) {
				int rand = (int) (Math.random() * 45 +1);
				
				
				// 중복제거
				if( lottoList.contains(rand) ) {
					j--;
				}
				else {
					lottoList.add(rand);
				}
			}
			
			// 해당 게임의 랜덤 수를 정렬
			Collections.sort(lottoList);

			// 출력
			for (Integer lotto : lottoList) {
				System.out.print(lotto + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}






