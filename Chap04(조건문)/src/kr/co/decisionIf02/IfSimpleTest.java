package kr.co.decisionIf02;

import java.util.Scanner;

public class IfSimpleTest {
	
	public static void main(String[] args) {
		int x = 5;
		
		if (x > 0) {
			System.out.println("양수입니다.");
		}
		
		// Quiz1. 정수 1개를 입력받아 입력된 수가 8의 배수인지를 출력하시오.
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수(숫자)를 입력하세요 : ");
		int y = scan.nextInt();
		
		if(y % 8 == 0) {
			System.out.println(y + " 은(는) 8의 배수입니다.");
		} else {
			System.out.println(y + " 은(는) 8의 배수가 아닙니다.");
		}
		System.out.println("프로그램 종료");
		
		// Quiz2. 나이를 입력받아 18세 이상이면 "성인입니다."를 출력하시오.
		System.out.print("나이를 입력하세요 : ");
		int z = scan.nextInt();
		
		if(z >= 18) {
			System.out.println("성인입니다.");
		} else {
			System.out.println("성인이 아닙니다.");
		}
		System.out.println("프로그램 종료");
		
		scan.close();
	}

}
