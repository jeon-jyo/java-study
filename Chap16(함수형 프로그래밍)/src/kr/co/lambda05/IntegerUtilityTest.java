package kr.co.lambda05;

public class IntegerUtilityTest {
	
	public static void main(String[] args) {
		/*
		 *  정적 메서드 참조
		 *  - 클래스명::메서드명
		 */
		Converter<String,Integer> converter = IntegerUtility::stringToInt;
		int result = converter.convert("123");
	
		System.out.println("result : " + result);	// result : 123
	}
}
