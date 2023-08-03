package Day08.EX05_MultiInterface;


// 다중구현
// public class 클래스명 impelments 인터페이스A, 인터페이스B ... {}
public class SmartTelevision implements SmartRemoteControl, Searchable {

	int volume; 			// 볼륨
	int channel;			// 채널번호
	String keyword;			// 검색어
	int x, y;				// 터치패드 좌표
	
	
	@Override
	public String receiveVoice(String voice) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int channelSearch(String keyword) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String[] contentSearch(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void touch(int x, int y) {
		// TODO Auto-generated method stub
		
	}

}
