package kr.co.review;

public class MethodTest {
	
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		// Call by value (값에 의한 복사) - 값에 의해서 호출됨.
		int plusResult = add(num1, num2);
		System.out.println("num1 + num2 = " + plusResult);
		
		int minusResult = minus(num1, num2);
		System.out.println("num1 - num2 = " + minusResult);
	}

	public static int add(int x, int y) {
		System.out.println("add 메서드");
		return x + y;
	}
	
	public static int minus(int x, int y) {
		System.out.println("minus 메서드");
		return x - y;
//		if(x > y) {
//			return x - y;
//		} else {
//			return y - x;	
//		}
	}
	
	// 모든 활동이 끝나면 메모리 해체 (Debug 하면 알 수 있음)

}
