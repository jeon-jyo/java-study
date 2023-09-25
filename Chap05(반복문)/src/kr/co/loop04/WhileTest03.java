package kr.co.loop04;

import java.util.Scanner;

public class WhileTest03 {

	public static void main(String[] args) {
		
		/*
		 * =========================
		 * 1. 증속	2. 감속	3. 중지
		 * =========================
		 * 입력 : 4
		 * 잘못된 입력 값입니다.
		 * =========================
		 * 1. 증속	2. 감속	3. 중지
		 * =========================
		 * 입력 : 1
		 * 현재 속도 : 1
		 * =========================
		 * 1. 증속	2. 감속	3. 중지
		 * =========================
		 * 입력 : 1
		 * 현재 속도 : 2
		 * =========================
		 * 1. 증속	2. 감속	3. 중지
		 * =========================
		 * 입력 : 2
		 * 현재 속도 : 1
		 * =========================
		 * 1. 증속	2. 감속	3. 중지
		 * =========================
		 * 입력 : 3
		 * 프로그램을 종료합니다.
		 * 
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		int speed = 0;
		boolean run = true;
		
		while(run) {	// true
			System.out.println("=========================");
			System.out.println("1. 증속	2. 감속	3. 중지");
			System.out.println("=========================");
			System.out.print("입력 : ");
			int num = scanner.nextInt();
			
			if (num == 1) {
				speed ++;
				System.out.println("현재속도 : " + speed);
				continue;
			} else if (num == 2) {
				speed --;
				System.out.println("현재속도 : " + speed);
				continue;
			} else if (num == 3) {
				System.out.println("프로그램을 중지합니다.");
				run = false;	// break;
			} else {
				System.out.println("잘못된 입력 값입니다.");
				continue;
			}
		}
		
		scanner.close();
	}
}
