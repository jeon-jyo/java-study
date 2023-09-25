package kr.co.stream02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/*
 * 파일에서 바이트 배열로 자료 읽기 -- 배열에 남아 있는 (쓰레기) 자료가 있을 수 있음
 */
public class FileInputStreamTest04 {

	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("input2.txt")) {
			int i; 
			byte[] bs = new byte[10];
			while((i = fis.read(bs)) != -1) {
				/*
				 * public int read(byte b[]) throws IOException {
				 * 		return readBytes(b, 0, b.length);
				 * }
				 * = int read(byte[] b, int off, int len)
				 * -> 입력 스트림으로 부터 b[] 크기의 자료를 b[]의 off 변수 위치부터 저장하며
				 *    len 만큼 읽고, 읽은 자료의 바이트 수를 반환
				 *                          
				 * 1 byte 씩 배열 크기만큼 최대로 읽음 (byte[10] 단위 만큼)
				 * bs 에 저장하고, i 에 읽은 자료의 바이트 수를 반환
				 * 
				 * 6번 밖에 못 읽었을 때 i 는 6이고 남은 배열은 기존 값을 그대로 출력
				 * -> Q R S T 는 Buffer 에 남은 Garbage
				 * -> 오버라이드가 안되었기 때문에 그 뒤에 남은 것이 들어옴
				 */
				for (byte b : bs) {
					System.out.print((char)b + " ");
				}
				System.out.println(" : " + i + "바이트 읽음");
				/*
				 * A B C D E F G H I J  : 10바이트 읽음
				 * K L M N O P Q R S T  : 10바이트 읽음
				 * U V W X Y Z Q R S T  : 6바이트 읽음
				 */
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end");					// end
		
	}
}
