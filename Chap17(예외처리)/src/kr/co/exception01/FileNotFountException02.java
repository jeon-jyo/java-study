package kr.co.exception01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileNotFountException02 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("himedia.txt");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (fis != null) {		// null 체크
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			System.out.println("finally 블록은 항상 수행");	// finally 블록은 항상 수행
		}
		System.out.println("end");							// end
		
	}
}
