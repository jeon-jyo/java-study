package kr.co.lambda04;

public class FunctionalInterfaceTest04 {

	public static void main(String[] args) {
		
		MathOperation mo = (int x, int y) -> {return x + y;};
		int result = mo.operation(100, 200);
		
		System.out.println("result : " + result);
	}

}
