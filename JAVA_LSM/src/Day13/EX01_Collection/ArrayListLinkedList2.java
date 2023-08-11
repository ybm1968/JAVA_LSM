package Day13.EX01_Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 *  중간에 요소를 추가
 *  ArrayList 와 LinkedList 의 속도비교
 *  - 결론 : LinkedList 가 더 빠르다
 */

public class ArrayListLinkedList2 {
	
	public static void main(String[] args) {
		
		// 중간에 데이터 삽입/삭제는 LinkedList 가 ArrayList 보다 빠르다
		List<String> arryList = new ArrayList<String>();
		List<String> linkedList = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		// 밀리초 	: 1/1000초	(0.001)
		// 마이크로초	: 10^6초		(0.000001초)
		// 나노초		: 10^9초		(0.000000001초)
		
		startTime = System.nanoTime();			// 시스템의 시간을 ns 단위로 출력
		// ArrayList에 데이터 삽입
		for (int i = 0; i < 100000; i++) {
			arryList.add(0, String.valueOf(1));
			
		}
		endTime = System.nanoTime();
		
		long arrayListTime = (endTime - startTime);
		System.out.println("ArrayList 데이터 삽입 시간 : " + arrayListTime + "ns");
		
		System.out.println("------------------------------------------");
		
		startTime = System.nanoTime();			// 시스템의 시간을 ns 단위로 출력
		// LinkedList에 데이터 삽입
		for (int i = 0; i < 100000; i++) {
			linkedList.add(0, String.valueOf(1));
			
		}
		endTime = System.nanoTime();
		
		long linkedListTime = (endTime - startTime);
		System.out.println("linkedList 데이터 삽입 시간 : " + linkedListTime + "ns");
		
		System.out.println("------------------------------------------");
		if(arrayListTime > linkedListTime) {
			System.out.println("LinkedList가 데이터 삽입 속도가 더 빠르다");
		}
		else {
			System.out.println("ArrayList가 데이터 삽입 속도가 더 빠르다");
		}
	}

}
