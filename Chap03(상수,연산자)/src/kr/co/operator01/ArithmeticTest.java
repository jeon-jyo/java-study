package kr.co.operator01;

public class ArithmeticTest {
	
	public static void main(String[] args) {
		
		int num1 = 7;
		int num2 = 3;
		
		System.out.println("num1 + num2 = "  + num1 + num2);
		System.out.println("(num1 + num2) = "  + (num1 + num2));
		System.out.println("(num1 - num2) = "  + (num1 - num2));
		System.out.println("(num1 * num2) = "  + (num1 * num2));
		System.out.println("(num1 / num2) = "  + (num1 / num2));	// 2 나누기
		System.out.println("(num1 % num2) = "  + (num1 % num2));	// 1 나머지
		
		System.out.println();
		
		int result;
//		result = 10/0;	// 실행시 에러 . 런타임 에러 . ArithmeticException
		
		// 예외처리 코드 . Exception 처리		
		try {
			result = 10/0;
		} catch (ArithmeticException e) {
			System.out.println("예외가 발생함 : " + e);
		}
		
	}

}
