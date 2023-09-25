package kr.co.stream03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest02 {

	public static void main(String[] args) {
		
		try (FileOutputStream fos = new FileOutputStream("output2.txt", true)) {
			/*
			 * public FileOutputStream(String name) throws FileNotFoundException {
			 * 		this(name != null ? new File(name) : null, false);
			 * }
			 * 
			 * false - 덮어 씌워짐 (default)
			 * true - append 됨
			 */
			byte[] bs = new byte[26];
			byte data = 65;		// 'A' 의 아스키 코드값
			for(int i = 0; i < bs.length; i++) {
				bs[i] = data++;
			}
			fos.write(bs);		// 배열 한꺼번에 출력하기
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");
		
	}
}
