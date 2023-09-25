package kr.co.stream02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/*
 * 파일의 끝까지 한 바이트 (1byte) 씩 자료 읽기
 */
public class FileInputStreamTest03 {

	public static void main(String[] args) {
		
		try (FileInputStream fis = new FileInputStream("input.txt")) {
			int i;
			while((i = fis.read()) != -1) {
				System.out.print((char)i + " ");	// A B C D e f g
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end");					// end
		
	}
}
