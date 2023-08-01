package Day02;

public class EX03_LogicalOperator {
	public static void main(String[] args) {
		System.out.println(true && true);
		System.out.println(true && false);
		
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(true || (100 < 50));
		System.out.println((5 < 20) || (5 > 2));
		System.out.println();
		
		// XOR(^)
		// A XOR B		: A와 B가 다를 때, 결과가 true
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println((9 >= 2) ^ (7 > 4));
		System.out.println();
		
		System.out.println(!true);
		System.out.println(!false);
		System.out.println();
		
		int value1 = 3;
		System.out.println(false && ++value1 > 10);
		System.out.println(value1);
		
		int value2 = 3;
		System.out.println(true || ++value2 > 5);
		System.out.println(value2);
		
		// 비트연산자의 경우는 쇼트서킷이 적용되지 않는다.
		int value3 = 3;
		System.out.println(false & ++value3 > 10);
		System.out.println(value3);
		
		int value4 = 3;
		System.out.println(true | ++value4 > 5);
		System.out.println(value4);
	}
}
