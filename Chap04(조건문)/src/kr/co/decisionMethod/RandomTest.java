package kr.co.decisionMethod;

public class RandomTest {

	public static void main(String[] args) {
		
		// 0.000000 ~ 0.999999 사이의 값을 발생시킴
		System.out.println(Math.random());	// double java.lang.Math.random()
		
		// 주사위
		int num = (int)(Math.random() * 6);	// 0~5
		num = (int)(Math.random() * 6) + 1;	// 1~6 까지 범위의 수를 발생시키는 식
		System.out.println(num);
		
		// 로또
		int num2 = (int)(Math.random() * 45) + 1;	// 1~45 까지의 숫자 중 6개를 맞힘
		System.out.println(num2);
		
		switch (num) {
		case 1:
			System.out.println("1이 나왔네요!");
			break;
		case 2:
			System.out.println("2가 나왔네요!");
			break;
		case 3:
			System.out.println("3이 나왔네요!");
			break;
		case 4:
			System.out.println("4가 나왔네요!");
			break;
		case 5:
			System.out.println("5가 나왔네요!");
			break;
		case 6:
			System.out.println("6이 나왔네요!");
			break;

		}
		
	}
}
