package kr.co.stream01;

import java.io.IOException;

public class SystemMemberTest02 {

	public static void main(String[] args) {
		
		System.out.println("알파벳 여러 개를 쓰고 [Enter]를 누르세요.");
		
		int i;
		
		try {
			while((i = System.in.read()) != -1) {	// [ABCD 입력]
				System.out.print((char)i);			// ABCD
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
