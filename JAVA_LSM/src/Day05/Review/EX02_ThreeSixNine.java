package Day05.Review;

public class EX02_ThreeSixNine {
	public static void main(String[] args) {
		// 1 ~ 100 반복하면서 3 또는 6 또는 9 일떄
		// 369가 되는 개수 만큼 "*"을 출력
		// 3  -> "*" 
		// 39 -> "**"
		
		for (int i = 1; i <= 100; i++) {
			int one = i % 10;
			int ten = i / 10;
			boolean ten369 = (ten == 3 || ten == 6 || ten == 9);
			boolean one369 = (one == 3 || one == 6 || one == 9);
			
			if (ten369 && one369)  {
				System.out.print("**");
			}
			else if ( ten369 || one369) {
				System.out.println("*");
			}
			else {
				System.out.println(i);
			}
		}
	}
}
