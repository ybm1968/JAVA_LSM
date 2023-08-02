package Test;

public class Samsung extends Computer {

	@Override
	public void turnOn() {
		System.out.println("컴퓨터를 키다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("컴퓨터를 끄다");
		
	}
	
	public void Search() {
		System.out.println("검색을 합니다.");
	}
	
}
