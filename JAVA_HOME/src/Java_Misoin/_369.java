package Java_Misoin;

public class _369 {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			int one = i % 10;
			int ten = i / 10;
			boolean one369 = false;
			boolean ten369 = false;
			
			if(one == 3 || one == 6 || one == 9 ) {
				one369 = true;
			}
			if(ten == 3 || ten == 6 || ten == 9 ) {
				ten369 = true;
			}
			
			if(ten369 && one369) {
				System.out.print("**");
			}
			else if(ten369 || one369) {
				System.out.print("*");
			} 
			else {
				System.out.print(ten*10 + one);
			}
			System.out.println();
		
		}
		
		
		
	}
}
