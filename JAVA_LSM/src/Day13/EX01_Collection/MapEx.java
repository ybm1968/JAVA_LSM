package Day13.EX01_Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// 요소 추가
		map.put("RM", 90);
		map.put("진", 100);
		map.put("슈가", 70);
		map.put("정국", 95);
		map.put("뷔", 60);
		map.put("제이홉", 50);
		map.put("지민", 80);
		
		map.put("RM", 99); 		// 중복된 키를 입력하면, 마지막에 추가한 값으로 덮어서 저장된다
		
		System.out.println("총 개수 : " + map.size());
		System.out.println();
		
		System.out.println("지민의 코딩성적 : " + map.get("지민"));
		System.out.println("RM의 코딩성적 : " + map.get("RM"));
		System.out.println();
		
		// ketSet() : 모든 키를 가져온다
		Set<String> keySet = map.keySet();
		
		for (String key : keySet) {
			Integer value = map.get(key);
			System.out.println(key + " : " + value);
		}	
		System.out.println();
		
		map.remove("지민");
		System.out.println("총 개수 : " + map.size());
		System.out.println();
		
		// Iterator 를 이용한 반복
		// map.entrySet()			: iterator() 메소드를 갖는 Set 객체를 반환
		// entrySet.iterator()		: Map 컬렉션을 순차 검색할 수 있는 iterator 객체로 가져옴
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while( entryIterator.hasNext() ) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();		// 키
			Integer value = entry.getValue();	// 값
			
			System.out.println(key + " : " + value);
			
		}
		System.out.println();
		map.clear();		// 모든 요소 삭제
		
		System.out.println("총 개수 : " + map.size());
		System.out.println("empty 여부 : " + map.isEmpty());
	}
	
}
