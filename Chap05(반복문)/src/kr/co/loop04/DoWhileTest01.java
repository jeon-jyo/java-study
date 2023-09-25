package kr.co.loop04;

import java.util.Scanner;

public class DoWhileTest01 {
	
	public static void main(String[] args) {
		
		// 입력받은 모든 숫자의 합을 출력하는 프로그램을 작성하시오.
		// 단 0을 입력하면 반복 그만하고 합을 출력하시오.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		
		int sum = 0;
		int input;
		
		do {
			input = scanner.nextInt();
			sum += input;
			
		} while(input != 0);
		
		System.out.println(sum);
	
		scanner.close();
	}

}
