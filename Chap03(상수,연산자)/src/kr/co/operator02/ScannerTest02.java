package kr.co.operator02;

import java.util.Scanner;

/*
 * 여러 숫자가 입력되면 일단 버퍼(buffer)에 내용을 넣고
 * 스페이스(공백)이나 탭으로 구분하여 하나씩 입력된 데이터를 변수에 대입하게 됨
 */

/*
 * next() : 공백을 기준으로 해서 문자를 입력 (단어 입력시 사용)
 * nextLine() : 엔터키를 입력할 때 까지 문자열을 입력 (문장 입력시 사용)
 * 				버퍼비우기(스트림 비우기)
 */

public class ScannerTest02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 한자리 입력 : ");
		int num = sc.nextInt();
		System.out.println("사용자로부터 입력받은 숫자 : " + num);
		
		System.out.print("실수 한자리 입력 : ");
		float dNum = sc.nextFloat();
		System.out.println("사용자로부터 입력받은 숫자 : " + dNum);
		
		sc.nextLine();
		
		System.out.print("문자열을 입력 : ");
		String str = sc.next();	// 가나다라 마바사
		System.out.println("사용자로부터 입력받은 문자열 : " + str);	// 가나다라
		
		sc.nextLine();
		
		System.out.print("문자열을 입력 : ");
		String str2 = sc.nextLine();	// 가나다라 마바사
		System.out.println("사용자로부터 입력받은 문자열 : " + str2);	// 가나다라 마바사
		
		sc.close();
	}

}
