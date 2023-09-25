package kr.co.stream03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStreamTest {

	public static void main(String[] args) {
		
		byte[] bs = new byte[26];
		byte data = 65;
		for(int i = 0; i < bs.length; i++) {
			bs[i] = data++;
		}
		
		try (FileOutputStream fos = new FileOutputStream("output4.txt");
				FileInputStream fis = new FileInputStream("output4.txt")) {
			// output3.txt 생성하면서 씀
			fos.write(bs);
			// output2.txt 읽으면서 콘솔에 출력
			int ch;
			while( (ch = fis.read()) != -1) {
				System.out.print((char)ch + " ");
			}
			/*
			 * A B C D E F G H I J K L M N O P Q R S T U V W X Y Z 
			 */
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println();
		System.out.println("작업이 완료되었습니다.");
		
	}
}
