package kr.co.exception01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileNotFountException01 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;		// 초기화
		
		try {
			fis = new FileInputStream("himedia1.txt");
			
			try {						// 예외가 발생할 땐 실행안됨
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();		// 어디에서 예외가 발생했는지 출력
										// 배포할 땐 e.getMessage() 혹은 e.toString()
		}
		System.out.println("end");
		/*
			java.io.FileNotFoundException: himedia1.txt (지정된 파일을 찾을 수 없습니다)
				at java.base/java.io.FileInputStream.open0(Native Method)
				at java.base/java.io.FileInputStream.open(FileInputStream.java:219)
				at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
				at java.base/java.io.FileInputStream.<init>(FileInputStream.java:112)
				at kr.co.exception.FileNotFountException01.main(FileNotFountException01.java:14)
			end
		 */
	}
}
