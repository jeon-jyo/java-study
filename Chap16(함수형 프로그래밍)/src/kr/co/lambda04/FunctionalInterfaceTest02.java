package kr.co.lambda04;

public class FunctionalInterfaceTest02 {

	public static void main(String[] args) {
		
		MathOperation mo = new MathOperationImpl();
		int result = mo.operation(100, 200);
		
		System.out.println("result : " + result);
	}
}
