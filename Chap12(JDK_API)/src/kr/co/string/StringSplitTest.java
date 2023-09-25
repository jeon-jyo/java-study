package kr.co.string;

import java.util.Scanner;

public class StringSplitTest {

	public static void main(String[] args) {
		
		String str = "Hello,World,Java";
		String str2 = "Hello World! Java~";

		String[] strArr = str.split(",");		// 구분자
		String[] strArr2 = str2.split("\\s");	// 정규식 - "\s" 공백을 의미

		for(String s : strArr) {
			System.out.println(s);
		}
		System.out.println();
		for(String s : strArr2) {
			System.out.println(s);
		}
		System.out.println();
		/*
			Hello
			World
			Java
			
			Hello
			World!
			Java~
		 */
		
		/*
		 * 문자열을 입력하세요 : 우리 나라 만 세
		 * 
		 * 우리
		 * 나라
		 * 만
		 * 세
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		String strScan = scanner.nextLine();
		
		String[] strScanArr = strScan.split(" ");
		String[] strScanArr2 = strScan.split("\\s");
		
		for(String s : strScanArr) {
			System.out.println(s);
		}
		System.out.println();
		for(String s : strScanArr2) {
			System.out.println(s);
		}
		/*
			우리
			나라
			만
			세
			
			우리
			나라
			만
			세
		 */
		scanner.close();
	}
}
