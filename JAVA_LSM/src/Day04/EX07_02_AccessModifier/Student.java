package Day04.EX07_02_AccessModifier;

import Day04.EX07_01_AccessModifier.Person;

public class Student extends Person{
	
	// 생성자
	public Student() {
		super();
	}

	public Student(String name, int height, int age, int weight) {
		super(name, height, age, weight);
		
	}
	
	public void defaultSetting() {
		name = "이름없음";
		height = 160;
		// age = 20;			// default는 같은 패키지에서만 접근가능
		// weight = 40;			// private는 해당 클래스에서만 접근가능
		setAge(20);
		setWeight(40);
	}

	
}
