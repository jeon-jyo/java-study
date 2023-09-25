package kr.co.decisionIf02;

import java.util.Scanner;

public class IfElseIfElseTest {
	
	public static void main(String[] args) {	// args 변수. 타입은 배열
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		int score = scan.nextInt();
		
		/*
		 * Validation : score 변수의 값에 따라서 조건문 분기가 일어나며,
		 * 				정확한 값 범위를 사용하겠다는 것
		 */
		
		if (score <= 100 || score >= 0) {
			if(score >= 90) {
				System.out.println("점수가 90~100점 사이입니다.");
				System.out.println("등급은 A입니다.");
			} else if(score >= 80) {
				System.out.println("점수가 80~89점 사이입니다.");
				System.out.println("등급은 B입니다.");
			} else if(score >= 70) {
				System.out.println("점수가 70~79점 사이입니다.");
				System.out.println("등급은 C입니다.");
			} else if(score >= 60) {
				System.out.println("점수가 60~69점 사이입니다.");
				System.out.println("등급은 D입니다.");
			} else {
				System.out.println("등급은 F입니다.");
			}
		} else {
			System.out.println("점수를 잘못 입력했습니다.");
		}

		scan.close();
	}

}
