package kr.co.staticzone01;

public class NonStaticTest {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;

		NonStaticTest nst = new NonStaticTest();
		int result = nst.sum(a,b);
		System.out.println(result);
	}
	
	public int sum(int a, int b) {
		int result = a + b;
		return result;
	}
	
}
