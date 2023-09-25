package kr.co.stream05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest01 {

	public static void main(String[] args) {
		
		long millisecond = 0;
		
		try(FileInputStream fis = new FileInputStream("Storyboard.sample.zip");
				FileOutputStream fos = new FileOutputStream("copyfile.zip")) {
			// 현재 시간값 저장
			millisecond = System.currentTimeMillis();
			
			int i;
			while ((i = fis.read()) != -1) {
				fos.write(i);
			}
			millisecond = System.currentTimeMillis() - millisecond;
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(millisecond + "동안 복사가 완료되었습니다.");
		/*
		 * 7831동안 복사가 완료되었습니다.
		 */
	}
}
