package kr.co.lambda10;

public class LambdaTest {

	public static void main(String[] args) {
		
		// 익명 내부 클래스 사용
		MathOperation add = new MathOperation() {
			
			@Override
			public int operation(int x, int y) {
				return x + y;
			}
		};
		int result = add.operation(100, 200);
		System.out.println(result);
		
		// 람다식 사용
		MathOperation add2 = (x, y) -> x + y;
		int result2 = add2.operation(100,200);
		System.out.println(result2);
		
		// 람다식 사용 *
		MathOperation multi = (x, y) -> x * y;
		int result3 = multi.operation(2, 150);
		System.out.println(result3);
	}
}
