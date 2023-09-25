package kr.co.decisionIf01;

import java.util.Scanner;

public class IfElseTest02 {
	
	// public 을 생략하면 기본접근제한자가 생략
	// static 으로 정의하면 공유를 목적 . 전역 느낌
	static final String ADMIN_ID = "admin";
	static final String ADMIN_PASSWORD = "1128";

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("ID : ");
		String id = scan.nextLine();
		System.out.print("PW : ");
		String pw = scan.nextLine();
		
		if(id.equals(ADMIN_ID) && pw.equals(ADMIN_PASSWORD)) {
			System.out.println("관리자 로그인 성공!");
		} else {
			System.out.println("로그인 실패");
		}
		
		scan.close();
	}
}
