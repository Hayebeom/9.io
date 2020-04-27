package bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyDemo4 {
	
	public static void main(String[] args) throws FileNotFoundException, IOException{
		System.out.println("파일 복사를 시작합니다.");
		long startTime = System.currentTimeMillis();
		
		FileInputStream fis = new FileInputStream("c:/files/SleepAway.mp3");
		FileOutputStream fos = new FileOutputStream("c:/files/sleep away.mp3");
		
		int value = 0;
		while ((value = fis.read()) != -1) {
			fos.write(value);
		}
		
		fis.close();
		fos.close();
		
		long endTime = System.currentTimeMillis();
		System.out.println("파일 복사가 종료되었습니다.");
		System.out.println("소요시간 : " + ((endTime - startTime) / 1000 + "초"));
	}
}
