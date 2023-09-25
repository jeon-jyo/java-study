package kr.co.lambda02;

public class MyNumberTest {

	public static void main(String[] args) {
		
		// 람다식을 함수형 인터페이스 타입 변수 getMaxF 에 대입
		MyNumber getMaxF = (x, y) -> (x > y) ? x : y;
		
		// 함수형 인터페이스 자료형 변수로 함수 호출
		System.out.println(getMaxF.getMax(100, 200));		// 200
	}
}
