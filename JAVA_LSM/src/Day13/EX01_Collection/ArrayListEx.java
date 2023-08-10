package Day13.EX01_Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx {

	public static void main(String[] args) {
		
		// import 단축키 : ctrl + shift + O
		ArrayList<String> list = new ArrayList<String>();
		
		// 요소 추가
		list.add("Java");			// 프로그래밍 언어
		list.add("JDBC");			// Java 와 DB를 연결하는 인터페이스
		list.add("JSP");			// Java 서버 페이지
		list.add("SPRING");			// 자바기반 웹 개발 프레임워크
		
		int size = list.size();
		System.out.println("요소의 개수 : " + size);
		
		// 요소 검색
		String first = list.get(0);
		System.out.println("첫번쨰 기술스택 : " + first);
		// 반복1
		System.out.println(">>반복 1");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i) + " ");
		}
		System.out.println("\n");
		
		// 반복2
		System.out.println(">>반복 2");
		for (String skill : list) {
			System.out.println(skill + " ");
		}
		System.out.println("\n");
		
		// 요소 삭제
		list.remove(0);
		list.remove("SPRING");
		
		// 반복3
		System.out.println(">>반복 3");
		Iterator<String> it = list.iterator();
		int i = 0;
		while( it.hasNext() ) {
			String item = it.next();
			System.out.println("item" + ++i + " : " + item);
		}
		System.out.println();
		
		// 반복4
		i = 0;
		System.out.println(">>반복4");
		for (Iterator iterator = list.iterator(); iterator.hasNext(); i++) {
			String item = (String) iterator.next();	
			System.out.println("item" + i + " : " + item);
		}
	}
}
