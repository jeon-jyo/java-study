package kr.co.decisionIf01;

import java.util.Scanner;

public class IfElseTest01 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자(정수)를 입력하세요 : ");
		int age = scan.nextInt();
		
		if(age >= 8) {
			System.out.println("학교에 다닙니다.");
		} else {
			System.out.println("학교에 다니지 않습니다.");
		}
		
		scan.close();
	}

}
