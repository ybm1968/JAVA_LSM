package Day08.EX05_MultiInterface;


// 다중구현
// public class 클래스명 impelments 인터페이스A, 인터페이스B ... {}
public class SmartTelevision implements SmartRemoteControl, Searchable {

	int volume; 			// 볼륨
	int channel;			// 채널번호
	String keyword;			// 검색어
	int x, y;				// 터치패드 좌표
	
	@Override
	public void turnOn() {
		System.out.println("전원 ON");
		
	}
	@Override
	public void turnOff() {
		System.out.println("전원 OFF");
	}
	
	@Override
	public void setVolume(int volume) {
		this.volume = volume;
		System.out.println("volume : " + volume);
		
	}
	
	@Override
	public void setChannel(int channel) {
		this.channel = channel;
		System.out.println("channel : " + channel);
		
	}
	
	@Override
	public String receiveVoice(String voice) {
		System.out.println("음성입력 : " + voice);
		return "voice : " + voice;
	}
	
	@Override
	public int channelSearch(String keyword) {
		int channel = 0;
		
		switch (keyword) {
		case "Mnet":
			channel = 27;
			break;
		case "SBS":
			channel = 5;
			break;
		case "KBS":
			channel = 7;
			break;
		case "MBC":
			channel = 11;
			break;
		}
		return channel;
	}
	
	@Override
	public String[] contentSearch(String keyword) {
		String[] movieContent = {"엘리멘탈", "범죄도시3", "미션임파서블", "인시디언스", "타짜"};
		String[] idolContent = {"뉴진스", "BTS", "피프티피프티", "르세라핌", "이미티이션레이블" };
		String[] recommendContent = {"추천컨텐츠", "메타코미디", "숏박스", "쯔양"};
		String[] choiceContent;
		
		switch (keyword) {
		case "영화": 
			choiceContent = movieContent;
			break;
		case "아이돌":
			choiceContent = idolContent;
			break;
		default:		
			choiceContent = recommendContent;
			break;
		}
		return choiceContent;
	}
	
	@Override
	public void touch(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("(x, y) : " + x + ", " + y);
		
	}
	
}
