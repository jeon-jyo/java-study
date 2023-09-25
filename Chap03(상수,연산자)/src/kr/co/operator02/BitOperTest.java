package kr.co.operator02;

public class BitOperTest {
	
	public static void main(String[] args) {
		
		int num1 = 5;	// 0000 0101
		int num2 = 10;	// 0000 1010

		System.out.println(~num1);			// -6 -> 1111 1010	// 반전
		System.out.println(num1 & num2);	// 0  -> 0000 0000	// 1 & 1 만 1 반환, 그외는 0
		System.out.println(num1 & num1);	// 5  -> 0000 0101	// 1 & 1 만 1 반환, 그외는 0
		System.out.println(num1 | num2);	// 15 -> 0000 1111	// 하나라도 1이면 1 반환, , 그외는 0
		System.out.println(num1 ^ num2);	// 15 -> 0000 1111	// 서로 다른 경우만 1 반환, 같으면 0
		
		System.out.println(num1 << 2);	// 20 -> 0001 0100	// num1 자체는 안바뀌고 0000 0101 에서 왼쪽 00 없어지고 앞으로 당겨짐
		System.out.println(num1);		// 5
		
		num1 <<= 2;	// 연산해서 assign . num1=(num1<<2);
		
		System.out.println(num1);	// 20
		
	}

}
