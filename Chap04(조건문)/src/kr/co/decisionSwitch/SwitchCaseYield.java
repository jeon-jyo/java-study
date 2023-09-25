package kr.co.decisionSwitch;

import java.util.Scanner;

/*
 * Java Build Path, java Compiler -> jdk 17로 바꿈
 */

public class SwitchCaseYield {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("월 : ");
		int month = scanner.nextInt();
		
		int day = switch (month) {
			case 1,3,5,7,8,10,12 -> {
				yield 31;
			}
			case 4,6,9,11 -> {
				yield 30;
			}
			case 2 -> {
				yield 2;
			}
			default -> {
				System.out.println("존재하지 않는 달입니다.");
				yield 0;
			}
		};
		System.out.println(day + "일 까지입니다.");
		
		scanner.close();
	}

}
