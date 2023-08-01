package Day01;

public class EX07_Byte {
	public static void main(String[] args) {
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = (byte) 128;	
		// byte var6 = 200;
		// 에러 메시지 : Type mismatch - 타입이 불일치, 데이터 범위를 벗어남(오버플로우)
		// 1byte = 8bit(2^8 : 256개)
		// -128 ~ 127 범위로 표현가능
		
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
		System.out.println("var5 : " + var5);
		
	}

}
