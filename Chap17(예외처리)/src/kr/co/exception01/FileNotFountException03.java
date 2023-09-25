package kr.co.exception01;

import java.io.FileInputStream;
import java.io.IOException;

public class FileNotFountException03 {

	public static void main(String[] args) {
		
		// 예외가 발생해도 close() 됨
		try(FileInputStream fis = new FileInputStream("himedia.txt")) {
			System.out.println("read");		// read
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end");			// end
		
	}
}
