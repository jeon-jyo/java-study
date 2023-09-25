package kr.co.operator02;

import java.util.Scanner;

public class ScannerTest01 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);	// java.util.Scanner.Scanner(InputStream source)
		
		System.out.println("숫자를 1 2 3 이렇게 입력하고 엔터를 입력하세요.");
		int num1 = scan.nextInt();	// java.util.Scanner.nextInt()
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		System.out.println("숫자를 1 입력하고 엔터를 입력하세요.");
		int num4 = scan.nextInt();
		System.out.println("숫자를 2 입력하고 엔터를 입력하세요.");
		int num5 = scan.nextInt();
		System.out.println("숫자를 3 입력하고 엔터를 입력하세요.");
		int num6 = scan.nextInt();
		
		System.out.printf("%d %d %d %d %d %d", num1, num2, num3, num4, num5, num6);
		
//		파라미터 갯수, 타입 ..
//		public PrintStream printf(Locale l, String format, Object... args)
		
		scan.close();
	}

}
