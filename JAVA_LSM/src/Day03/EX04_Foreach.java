package Day03;

public class EX04_Foreach {
	public static void main(String[] args) {
		String[] week = {"월", "화", "수", "목", "금", "토", "일"};
		
		for (int i = 0; i < week.length; i++) {
			System.out.print(week[i] + " ");
		}
		System.out.println();
		
		for (String day : week) {
			System.out.print(day + " ");
		}
		System.out.println();
	}
}
