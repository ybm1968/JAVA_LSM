package Day16.EX02_Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LottoriaArrayStream {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 게임? ");
		int n = sc.nextInt();
		
		// 랜덤 수 6개를 한 게임에 넣어줌
		for (int i = 0; i < n; i++) {
			System.out.print("[" + (i+1) + "] 게임 : ");
			ArrayList<Integer> lottoList = new ArrayList<Integer>();
			
			// 랜덤수 6개를 한 게임에 넣어줌
			HashSet<Integer> set = new HashSet<Integer>();
			for (int j = 0; j < 6; j++) {
				int rand = (int) (Math.random() * 45 +1);
				if ( !set.add(rand) ) j--;
			}
			
			// 중복되지 않은 랜덤 수 Set을 ArrayList로 변환하여 넣어줌
			lottoList = (ArrayList<Integer>) set.stream().collect(Collectors.toList());
			
			// 해당 게임의 랜덤 수를 정렬 + 출력
			lottoList.stream()
					 .sorted()
					 .forEach( lotto -> System.out.print(lotto + " ") );
			System.out.println();
			
		}
			
		
		sc.close();
	}
}






