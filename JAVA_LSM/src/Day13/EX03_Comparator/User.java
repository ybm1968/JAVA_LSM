package Day13.EX03_Comparator;

import java.util.Comparator;

public class User implements Comparator<User> {

	String id;
	String name;
	int age;
	
	// 생성자
	public User() {
	}

	public User(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	// getter, setter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compare(User o1, User o2) {
		// 정렬기준 1 : 나이순 - 오름차순
		// 정렬기준 2 : 이름순 - 오름차순
		// 반대로 내림차순으로 정렬하려면 반환값을 (-)음수를 붙여준다.
		
		// o1의 나이가 o2의 나이보다 클 떄, 양수		
		// o1의 나이가 o2의 나이보다 작을 떄, 음수		
		// o1의 나이가 o2와 같을 때, 0
			// o1의 이름이 o2의 이름보다 사전순으로 뒤에 있을때, 양수
			// o1의 이름이 o2의 이름보다 사전순으로 앞에 있을때, 음수
		int age1 = o1.getAge();
		int age2 = o2.getAge();
		String name1 = o1.getName();
		String name2 = o2.getName();
		
		
		// 방법1
//		if(age1 > age2) return 1;
//		if(age1 < age2) return -1;
//		if(age1 == age2) {
//			// 문자열.compareTo(비교문자열)				- String 클래스의 compareTo()
//			// 해당문자열 > 비교문자열 : 해당문자열이 사전순으로 비교문자열보다 뒤에 있는경우 -> 양수
//			// 해당문자열 = 비교문자열 : 해당문자열이 비교문자열과 사전순으로 같은 위치에 있는경우 -> 0
//			// 해당문자열 < 비교문자열 : 해당문자열이 사전순으로 비교문자열보다 앞에 있는경우 -> 음수
//			int gap = name1.compareTo(name2);
//			return gap;
////			if(gap > 0) return 1;
////			if(gap == 0) return 0;
////			if(gap < 0) return -1;
//		}
//		
		int result1 = age1 - age2;
		int result2 = name1.compareTo(name2);	
												
		
		return result1 == 0? result2 : result1;
		
		}
			
		
}

	
	
	
	
