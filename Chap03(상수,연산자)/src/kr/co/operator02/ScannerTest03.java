package kr.co.operator02;

import java.util.Scanner;

public class ScannerTest03 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int result = 100;
		
		System.out.print("문자열을 입력(숫자) : ");
		String temp = scanner.nextLine();
		
		// Integer.parseInt(String s) : 문자열로 입력받은 숫자들을 숫자로 바꿔주는 역할
		int pTemp = Integer.parseInt(temp);	// java.lang.Integer.parseInt(String s) throws NumberFormatException
		int total = result + pTemp;
		
		System.out.println("연산 결과 : " + total);
		
		scanner.close();
	}

}
