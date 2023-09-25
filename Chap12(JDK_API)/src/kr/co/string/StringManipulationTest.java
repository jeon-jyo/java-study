package kr.co.string;

public class StringManipulationTest {

	public static void main(String[] args) {
		
		String str = "HelloWorld";
		
		/* charAt() - 지정한 인덱스의 문자 값을 반환 */
		System.out.println(str.charAt(1));	// e
		System.out.println(str.replace("o", "0"));	// Hell0W0rld
		System.out.println(str.length());	// 10
		System.out.println(str.toUpperCase());	// HELLOWORLD
		System.out.println(str.toLowerCase());	// helloworld
		/*
		 * substring(int beginIndex)
		 *  - beginIndex(포함) 이후 부터
		 *  
		 * substring(int beginIndex, int endIndex)
		 *  - beginIndex(포함) 부터 endIndex(포함x) 까지
		 */
		System.out.println(str.substring(5));	// World
		System.out.println(str.substring(5, 8));	// Wor
		/* indexOf() - index에 해당 값이 없으면 -1 */
		System.out.println(str.indexOf("W"));	// 5
		
	}
}
