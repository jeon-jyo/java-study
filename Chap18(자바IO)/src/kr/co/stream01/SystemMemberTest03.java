package kr.co.stream01;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemMemberTest03 {

	public static void main(String[] args) {
		
		System.out.println("문자 입력 후 '끝'이라고 쓰세요.");
		
		int i;
		
		try {
			InputStreamReader isr = new InputStreamReader(System.in);	// System : 표준 입출력 스트림
			while((i = isr.read()) != '끝') {		// [오늘은 수요일 입니다. 입력]
													// [날씨가 좋습니다. 입력]
													// [끝 입력]
				System.out.print((char)i);			// 오늘은 수요일 입니다.
													// 날씨가 좋습니다.
				/*
				 * 한글은 2~3byte 라 다른 입출력을 써야함 (알파벳은 1byte)
				 *  -> InputStreamReader
				 *  	- 바이트 단위를 쓰지만 내부적으로 문자 단위를 입력할 수 있게끔 함
				 *      - 생성자의 매개변수로 또 다른 스트림(기반 스트림이나 다른 보조 스트림)을 가짐
				 *  a 는 1byte, char 는 2byte
				 */
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
