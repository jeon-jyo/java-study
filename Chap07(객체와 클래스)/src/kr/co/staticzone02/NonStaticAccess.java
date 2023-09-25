package kr.co.staticzone02;

public class NonStaticAccess {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		// 객체생성 접근
		YourUtil your = new YourUtil();
		int result = your.hap(a, b);
		System.out.println(result);
	}
}
