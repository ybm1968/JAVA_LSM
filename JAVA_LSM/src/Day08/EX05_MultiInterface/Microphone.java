package Day08.EX05_MultiInterface;

public interface Microphone {

	int inputVolumeMax = 50;			// 음성 인식 최대볼륨
	int inputVolumeMin = 5;				// 음성 인식 최소볼륨
	
	// 음성 인식
	String receiveVoice(String voice);
}
