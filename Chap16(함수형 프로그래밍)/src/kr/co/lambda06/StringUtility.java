package kr.co.lambda06;

public class StringUtility {

	// 인스턴스 메서드
	public String reverse(String s) {
		
		return new StringBuffer(s).reverse().toString();
	}
	
}
