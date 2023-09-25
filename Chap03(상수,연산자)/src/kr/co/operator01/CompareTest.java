package kr.co.operator01;

public class CompareTest {

	public static void main(String[] args) {
		
		int num1 = 5;
		int num2 = 3;
		boolean value = (num1 > num2);
		System.out.println(value);
		
		System.out.println(num1 < num2);
		System.out.println(num1 >= num2);
		System.out.println(num1 <= num2);
		System.out.println(num1 == num2);
		System.out.println(num1 != num2);
		
		// 실수형으로 자동 형변환이 되고나서 그 다음 비교 연산이 됨
		System.out.println("1.0 == 1 : " + (1.0 == 1));
		System.out.println("1.0 != 1 : " + (1.0 != 1));
	}
}
