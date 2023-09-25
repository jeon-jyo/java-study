package kr.co.stream04;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) {

		try (FileReader fis = new FileReader("reader.txt")) {
			int i;
			while ( (i = fis.read()) != -1 ) {
				System.out.print((char)i);	// 안녕하세요 반갑습니다. abc
											// FileInputStream 일 때 : ìëíì¸ì ë°ê°ìµëë¤. abcend
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println();
		System.out.println("end");
		
	}
}
