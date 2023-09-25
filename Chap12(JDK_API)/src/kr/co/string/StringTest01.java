package kr.co.string;

public class StringTest01 {

	public static void main(String[] args) {
		
		// String.equals()
		
		String str1 = new String("himedia");
		String str2 = new String("himedia");
		System.out.println(str1 == str2);		// false
		System.out.println(str1.equals(str2));	// true
		System.out.println();
		
		String str3 = "himedia";
		String str4 = "himedia1";
		System.out.println(str3 == str4);		// false
		System.out.println(str3.equals(str4));	// false
		System.out.println(str1 == str3); 		// false
		System.out.println(str1.equals(str3));	// true
		System.out.println();
		
		String str5 = "apple";
		String str6 = "banana";

		/*
		 * int java.lang.String.compareTo(String anotherString)
		 *  - 같다(0) : 아스키값을 빼서 똑같으면 0
		 *  - 그 외 양수/음수값
		 * int java.lang.String.compareTo(NumberSubClass referenceName)
		 * 	- 크다(1), 같다(0), 작다(-1) 의 관한 결과값을 리턴
		 */
		int result = str5.compareTo(str6);
		
		if(result == 0) {
			System.out.println("str5 == str6");
		} else if(result < 0) {
			System.out.println("str5 < str6");
		} else {
			System.out.println("str5 > str6");
		}
		/*
			str5 < str6
		 */
	}
}
