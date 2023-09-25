package kr.co.wrapper;

public class wrapperTest {

	public static void main(String[] args) {
		
		int a = 10;
		Integer aa = a;		// auto-boxing	-> new Integer(10);

		Integer bb = 20;	// auto-boxing
		int b = bb;			// auto-unBoxing
		
		float f = 10.5f;	// 기본 자료형
		Float ff = 45.6f;	// auto-boxing
		
	}
}
