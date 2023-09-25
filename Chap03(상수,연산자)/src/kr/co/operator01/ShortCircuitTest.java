package kr.co.operator01;

public class ShortCircuitTest {
	
	public static void main(String[] args) {
		
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 += 10) < 10) && ((i += 2) < 10);	// false 라서 뒤의 식 안함
		System.out.println(value);	// false
		System.out.println(num1);	// 20
		System.out.println(i);		// 2
		
		System.out.println();
		
		value = ((num1 += 10) < 10) || ((i += 2) < 10);	// true
		System.out.println(value);	// true
		System.out.println(num1);	// 30
		System.out.println(i);	// 4
		
	}

}
