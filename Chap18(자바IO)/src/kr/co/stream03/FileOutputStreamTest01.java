package kr.co.stream03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest01 {

	public static void main(String[] args) {
		
		try (FileOutputStream fos = new FileOutputStream("output.txt")) {
			/*
			 * "output.txt" 파일이 없어도 에러가 안남 . 알아서 생성해줌
			 * f5 하면 파일이 생겨져 있음
			 */
			fos.write(65);
			fos.write(66);
			fos.write(67);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");
		
	}
}
