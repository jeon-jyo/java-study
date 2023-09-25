package kr.co.interface01;

public class CompleteCalculatorTest {

	public static void main(String[] args) {
		
		Calc calc = new CompleteCalculator();
//		calc.showInfo();	// 부모급 Calc 이기 때문에 자식 메서드 안보임
		
		int num1 = 10;
		int num2 = 2;
		
		System.out.println(calc.add(num1, num2));		// 12
		System.out.println(calc.substract(num1, num2));	// 8
		System.out.println(calc.times(num1, num2));		// 20
		System.out.println(calc.divide(num1, num2));	// 5
		
		calc.describe();
		System.out.println();
		/*
			계산기를 구현합니다.
			private 메서드 호출
		 */
		
		int[] arr = {1, 2, 3, 4, 5};
		int sum = Calc.total(arr);
		System.out.println(sum);
		/*
			private static 메서드 호출
			15
		 */
	}
}
