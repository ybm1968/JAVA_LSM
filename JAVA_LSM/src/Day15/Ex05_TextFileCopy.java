package Day15;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex05_TextFileCopy {

	public static void main(String[] args) {
		// Test.txt 파일을 Test4.txt 파일로 복사
		FileReader fr = null;
		FileWriter fw = null;
		
		int data = 0;
		
		try {
			fr = new FileReader("./src/Day15/Test.txt");
			fw = new FileWriter("./src/Day15/Test4.txt");
			
			while( (data = fr.read()) != -1) {
				fw.write(data);
			}
			fr.close();
			fw.close();
			System.out.println("파일이 복사되었습니다.");
			System.out.println("Test.txt -> Test4.txt");
		} catch (IOException e) {
			System.err.println("입출력시, 예외가 발생했습니다.");
			e.printStackTrace();
		}
	}
}
