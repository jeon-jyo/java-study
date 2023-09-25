package kr.co.lambda04;

public class FunctionalInterfaceTest01 implements MathOperation {

	public static void main(String[] args) {
		
		// 인터페이스는 객체 생성 불가 - new MathOperation x
		MathOperation mo = new FunctionalInterfaceTest01();
		int result = mo.operation(100, 200);
		
		System.out.println("result : " + result);
	}
	
	@Override
	public int operation(int x, int y) {
		return x + y;
	}

}
