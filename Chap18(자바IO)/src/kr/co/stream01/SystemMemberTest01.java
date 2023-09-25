package kr.co.stream01;

import java.io.IOException;

public class SystemMemberTest01 {

	public static void main(String[] args) {
		
		System.out.println("알파벳 하나를 쓰고 [Enter]를 누르세요.");
		
		int i;
		
		try {
			i = System.in.read();			// [A 입력]
											// ABCD 입력하고 Enter 쳐도 A만 출력
			/*
			 * int java.io.InputStream.read() throws IOException
			 *  - 바이트단위로 읽어들임
			 *  - InputStream 이 끝에 도달했을 때 -1
			 */
			System.out.println(i);			// 65
			System.out.println((char)i);	// A
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
