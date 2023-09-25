package kr.co.lambda06;

import kr.co.lambda05.Converter;

public class StringUtilityTest {

	public static void main(String[] args) {
		/*
		 * 인스턴스 메서드 참조
		 *  - 객체 참조::메서드명
		 */
		StringUtility sUtility = new StringUtility();
		Converter<String, String> converter = sUtility::reverse;
		String result = converter.convert("Hello");
		
		System.out.println("result : " + result);	// result : olleH
	}
}
