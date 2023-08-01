package Day02;

public class EX04_BitOperator {
	public static void main(String[] args) {
		int result = 20 & 16;
		System.out.println(result);
		// Integer.toBinaryString() : 십진수를 이진수 문자열로 변환하는 메소드
		
		System.out.println(Integer.toBinaryString(20));
		System.out.println(Integer.toBinaryString(16));
		System.out.println("---------------------");
		System.out.println(Integer.toBinaryString(result));
		System.out.println();
		
		int result2 = 20 | 16;
		System.out.println(result2);
		
		System.out.println(Integer.toBinaryString(20));
		System.out.println(Integer.toBinaryString(16));
		System.out.println("---------------------");
		System.out.println(Integer.toBinaryString(result2));
		System.out.println();
		
		int result3 = 20 ^ 16;
		System.out.println(result3);
		
		System.out.println(Integer.toBinaryString(20));
		System.out.println(Integer.toBinaryString(16));
		System.out.println("---------------------");
		System.out.println(Integer.toBinaryString(result3));
		System.out.println();
		
		int result4 = ~20;
		System.out.println(result4);
		System.out.println(Integer.toBinaryString(20));
		System.out.println("---------------------");
		System.out.println(Integer.toBinaryString(result4));
		System.out.println();
		
		// 최상위비트(MSB)가 0이면 양수 1이면 음수		
		// 1의 보수 연산 : 0 -> 1, 1 -> 0 변환
		// 2의 보수 연산(양수 <-> 음수) : 1의 보수 연산을 하고 1을 더한다(+1)
		
		// 시프트 연산
		// 산술 시프트 ( << , >>) : 부호비트를 유지하면서, 왼쪽 또는 오른쪽으로 비트를 이동시키는 연산자
		// 논리 시프트 ( <<< , >>>) : 부호비트를 포함하면서, 왼쪽 또는 오른쪽으로 비트를 이동시키는 연산자
		
		System.out.println("<< 연산하면 2배씩 증가");
		System.out.println(2 << 1);
		System.out.println(2 << 2);
		System.out.println(2 << 3);
		System.out.println();
		
		System.out.println(">> 연산하면 1/2배씩 증가");
		System.out.println(16 >> 1);
		System.out.println(16 >> 2);
		System.out.println(16 >> 3);
		System.out.println();
		
		System.out.println("부호가 있는경우");
		System.out.println(-2 << 1);
		System.out.println(-2 << 2);
		System.out.println(-2 << 3);
		System.out.println();
		
		System.out.println( 2 >> 1);
		System.out.println(-2 >>> 31);
		System.out.println(Integer.toBinaryString(2));
		System.out.println(Integer.toBinaryString(-2));
		System.out.println();
		
		
	}
}
