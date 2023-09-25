package kr.co.stream02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/*
 * 파일에서 한 바이트 (1byte) 씩 자료 읽기
 */
public class FileInputStreamTest01 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			// FileNotFoundException
			fis = new FileInputStream("input.txt");
			// IOException
			System.out.println((char)fis.read());	// A
			System.out.println((char)fis.read());	// B
			System.out.println((char)fis.read());	// C
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					// IOException : close() 자체도 Exception 처리 되어있음
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("end");					// end
		
	}
}
