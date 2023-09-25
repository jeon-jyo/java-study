package kr.co.loop04;

import java.util.Scanner;

public class DoWhileTest02 {
	
	public static void main(String[] args) {
		
		/*
		 * 메시지를 입력하세요.
		 * 프로그램을 종료하려면, q를 입력하세요.
		 * 
		 * >하이미디어
		 * 입력받은 메시지 : 하이미디어
		 * >천호역
		 * 입력받은 메시지 : 천호역
		 * >q
		 * 프로그램을 종료합니다.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		String str = null;	// 참조하는 것이 없다.
		
		do {
			System.out.print(">");
			str = scanner.nextLine();
			System.out.println("입력받은 메시지 : " + str);
		} while(!str.equals("q"));
		
		System.out.println("프로그램을 종료합니다.");
	
		scanner.close();
	}

}
