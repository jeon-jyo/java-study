package kr.co.loop02;

import java.util.Scanner;

public class InputGugudan {
	
	public static void main(String[] args) {
		
		/*
		 * 구구단을 출력합니다.
		 * 몇 단 부터 출력할까요? :		(입력)
		 * 끝 단은 얼마인가요? : 	(입력)
		 * 
		 * ==========3단==========
		 * 3*1=3
		 * ...
		 * ==========4단==========
		 * ...
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("몇 단 부터 출력할까요?");
		int x = scanner.nextInt();
		System.out.print("끝 단은 얼마인가요?");
		int y = scanner.nextInt();
		
		for(; x <= y; x++) {
			System.out.println("==========" + x + "==========");
			for(int j = 1; j <= 9; j++) {
				System.out.println(x + "*" + j + "=" + (x*j));
			}
		}
		
		scanner.close();
	}

}
