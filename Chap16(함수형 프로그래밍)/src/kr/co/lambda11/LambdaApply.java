package kr.co.lambda11;

public class LambdaApply {

	public static void main(String[] args) {
		
		String input = "Lambda Expression";
		
		// 람다 표현식으로 모든 문자열을 대문자로 변환하는 StringOperation 구현하기
		StringOperation soUpper = s -> s.toUpperCase();
		String result = soUpper.apply(input);
		System.out.println(result);								// LAMBDA EXPRESSION
		
		// 람다 표현식으로 모든 문자열을 소문자로 변환하는 StringOperation 구현하기
		StringOperation soLower = s -> s.toLowerCase();
		String result2 = soLower.apply(input);
		System.out.println(result2);							// lambda expression
		
		System.out.println(oprationString(input, soUpper));		// LAMBDA EXPRESSION
		System.out.println(oprationString(input, soLower));		// lambda expression
		
		PrintString reStr = returnString();
		reStr.showString("Hello, ");							// Hello, Himedia
	}
	
	// 람다 표현식을 인자로 사용하는 메서드
	public static String oprationString(String input, StringOperation operation) {
		return operation.apply(input);
	}
	
	// 람다 표현식을 반환 값으로 사용
	public static PrintString returnString() {
		return s -> System.out.println(s + "Himedia");
	}
	
}
