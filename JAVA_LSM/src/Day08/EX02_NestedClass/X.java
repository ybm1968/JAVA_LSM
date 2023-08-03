package Day08.EX02_NestedClass;

// 중첩 클래스
public class X {
	
	// 생성자 
	X() {
		System.out.println("X 객체 생성");
	}
	
	// 인스턴스 이너 클래스
	// 인스턴스 이너 클래스 안에서는 static 멤버 사용불가
	class Y {
		int value;
		// static int value2;	static 사용불가
		
		// 생성자
		Y() {
			System.out.println("X의 Y객체 생성");
		}
		
		void method1() {
			System.out.println("Y의 메소드");
		}
	}
	
	// static 이너 클래스
	// static 이너 클래스에서는 static 멤버 사용가능
	static class Z {
		int value1;
		static int vlaue2;
		
		Z()	{
			System.out.println("X의 Z객체 생성");
		}
		
		void method1() {
			System.out.println("Z의 메소드");
		}
		
		static void method2() {
			System.out.println("Z의 static 메소드");
		}
}


	
	// 로컬 클래스 : 메소드 안에 정의한 클래스
	// - 메소드가 실행될 떄만 사용되는 이너 클래스
	void method() {
		// 로컬 클래스
		class L {
			int value1;
			// int static vlaue2;
			
			L() {
				System.out.println("L 객체 생성");
			}
			
			void method1() {
				System.out.println("L의 메소드");
			}
			
//			static void method2() {
//				System.out.println("L의 static 메소드");
//			}
		}
		
		L l = new L();
		l.value1 = 10;
		System.out.println("로컬 클래스 L의 변수 - " + l.value1);
		l.method1();
	}
}
