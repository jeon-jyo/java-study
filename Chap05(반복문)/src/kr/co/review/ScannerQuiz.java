package kr.co.review;

import java.util.Scanner;

public class ScannerQuiz {
	
	public static void main(String[] args) {
		
		/*
		 * 다음과 같은 결과가 나오게 구현하시오. (Scanner 사용)
		 * - 예시
		 * 		제목 : (자바자바)	<= 입력
		 * 		title = 자바자바
		 * 		가격 : (20000)
		 * 		price = 20000
		 * 		출판사 : (하이미디어)
		 * 		company = 하이미디어
		 * 		저자 : (이순신)
		 * 		author = 이순신
		 * 		페이지수 : (300)
		 * 		page = 300
		 * 		ISBN : (0101234)
		 * 		isbn = 0101234
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("제목 : ");
		String title = scanner.nextLine();
		System.out.println("title = " + title);
		
		System.out.print("가격 : ");
		int price = scanner.nextInt();
		System.out.println("price = " + price);
		
		// 문자열 입력 받기 전에 버퍼 비우기
		scanner.nextLine();
		
		System.out.print("출판사 : ");
		String company = scanner.nextLine();
		System.out.println("company = " + company);
		
		System.out.print("저자 : ");
		String author = scanner.nextLine();
		System.out.println("author = " + author);
		
		System.out.print("페이지수 : ");
		int page = scanner.nextInt();
		System.out.println("page = " + page);
		
		scanner.nextLine();
		
		System.out.print("ISBN : ");
		int isbn = scanner.nextInt();
		System.out.println("isbn = " + isbn);
		
		scanner.close();
	}

}
