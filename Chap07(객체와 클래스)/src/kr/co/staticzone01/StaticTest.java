package kr.co.staticzone01;

public class StaticTest {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		int result = sum(a,b);
		System.out.println(result);
		
		/*
		 * static 은 클래스명.메서드명() 으로 호출 가능
		 */
		result = StaticTest.sum(a,b);
		Math.abs(a);	// java.lang.Math - static class
		
		/*
		 * 일반적인 메서드는 객체를 생성한 후에 호출할 수 있다
		 *  - Cannot make a static reference to the non-static method sum(int, int) from the type staticTest
		 */
//		int result2 = sum2(a,b);
	}
	
	public static int sum(int a, int b) {
		int result = a + b;
		return result;
	}
	
	public int sum2(int a, int b) {
		int result = a + b;
		return result;
	}
	
}
