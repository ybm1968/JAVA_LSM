package _30;

import java.util.Scanner;

// 스트링토큰아이저로 문자열을 분리한다
// - 먼저 괄호를 통해서 괄호연산자와 괄호연산자가 아닌것을 분리한다
// - 그 다음 비괄호연산자와 괄호연산자끼리 또 분리한다
// 숫자와 연산자를 분리해서 계산순서대로 저장한다
// 산술연산자 메소드를 만든다
// 순서대로 값을 불러와서 연산자의 아스키코드 값을 인자값으로 넘겨줘서 매소드를 호출한다
// 매소드를 통해서 값을 구한다

public class _30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] ch = new char[str.length()];
		
		for (int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
		}
		
		
	}
}
