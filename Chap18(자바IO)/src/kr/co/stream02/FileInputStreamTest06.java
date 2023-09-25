package kr.co.stream02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/*
 * 파일에서 바이트 배열로 offset(시작점)에서 length 만큼 자료 읽기
 */
public class FileInputStreamTest06 {

	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("input2.txt")) {
			int i;
			byte[] bs = new byte[10];
			while((i = fis.read(bs, 0, 10)) != -1) {	// byte[10] 단위 만큼 읽음
//				for (byte b : bs) {
//					System.out.print((char)b + " ");
//				}
				/*
				 * A B C D E F G H I J  : 10바이트 읽음
				 * K L M N O P Q R S T  : 10바이트 읽음
				 * U V W X Y Z Q R S T  : 6바이트 읽음
				 */
				for(int k = 0; k < i; k++) {
					System.out.print((char)bs[k] + " ");
				}
				/*
				 * A B C D E F G H I J  : 10바이트 읽음
				 * K L M N O P Q R S T  : 10바이트 읽음
				 * U V W X Y Z  : 6바이트 읽음
				 */
				System.out.println(" : " + i + "바이트 읽음");
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end");					// end
		
	}
}
