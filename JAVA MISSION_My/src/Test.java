
class Person{
	int age = 1;
	
	void temp() {
		System.out.println("안바뀜");
		System.out.println(age);
	}
}

interface Temp2{
	void temp3();
}

class Person2 extends Person{
	
}

public class Test {

	
	public static void main(String[] args) {
		
//		익명자식개체
		
		Person person = new Person() {
			
			
			int age = 10;
			
			void temp() {
				System.out.println("바뀜");
				System.out.println(age);
			}
			
			
		};
	
		person.temp();
		System.out.println(person.age);
		
//		익명구현개체
		
		Temp2 temp2 = new Temp2() {
			public void temp3() {
				System.out.println("안녕");
			}
		};
		
	}
}
