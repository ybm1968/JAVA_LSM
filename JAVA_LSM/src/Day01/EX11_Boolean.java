package Day01;

import java.util.Scanner;

public class EX11_Boolean {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("전원 : ");
		 
		 boolean on = sc.nextBoolean();
		 
		 System.out.println("on : " + on);
		 
		 if(on) {
			 System.out.println("전원 ON");
		 } else {
			 System.out.println("전원 OFF");
		 }
		 sc.close();
	}
}
