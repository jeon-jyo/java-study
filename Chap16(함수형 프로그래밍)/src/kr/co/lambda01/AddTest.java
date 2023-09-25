package kr.co.lambda01;

public class AddTest {

	public static void main(String[] args) {
		
		// 람다식 구현
		// addF 는 Add 인터페이스의 자료형인 변수
//		Add addF = (int x, int y) -> {return x + y;};
		Add addF = (x, y) -> x + y;

		// 람다식 호출
		System.out.println(addF.add(3, 5));		// 8
	}
}
