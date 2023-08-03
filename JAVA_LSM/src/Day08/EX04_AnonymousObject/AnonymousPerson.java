package Day08.EX04_AnonymousObject;

public class AnonymousPerson {

	// 익명 자식 객체
	Person person = new Person() {
		
		void work() {
			System.out.println(name + "(" + age + ")");
			System.out.println("프로그래밍 합니다.");
			System.out.println();
		}
	};
	
	Person person2 = new Person() {
		
		void work() {
			System.out.println(name + "(" + age + ")");
			System.out.println("요리 합니다.");
			System.out.println();
		}
	};
	
	void method() {
		person.name = "김조은";
		person.age = 20;
		person.work();
		
		person2.name = "백종원";
		person2.age = 40;
		person2.work();
		
	}
	
}
