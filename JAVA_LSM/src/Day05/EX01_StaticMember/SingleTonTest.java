package Day05.EX01_StaticMember;

public class SingleTonTest {
	public static void main(String[] args) {
		SingleTon st01 = SingleTon.getInstance();
		SingleTon st02 = SingleTon.getInstance();
		
		// 인스턴스가 메모리 공간에 하나만 할당되어있다.
		System.out.println(st01 == st02);
	}
}
