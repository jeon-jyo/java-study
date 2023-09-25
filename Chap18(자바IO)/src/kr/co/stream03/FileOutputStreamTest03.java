package kr.co.stream03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest03 {

	public static void main(String[] args) throws FileNotFoundException {
		
		// throws FileNotFoundException
		FileOutputStream fos = new FileOutputStream("output3.txt");
				
		try (fos) {
			byte[] bs = new byte[26];
			byte data = 65;		// 'A' 의 아스키 코드값
			for(int i = 0; i < bs.length; i++) {
				bs[i] = data++;
			}
			fos.write(bs, 2, 10);		// 배열 2번째 위치부터 10번 출력
			/*
			 * CDEFGHIJKL
			 */
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");
		
	}
}
