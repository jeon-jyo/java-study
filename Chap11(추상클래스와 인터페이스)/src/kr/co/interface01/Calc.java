package kr.co.interface01;

public interface Calc {

	/*
	 * 모든 변수 public static final
	 * 모든 메서드 public abstract
	 *  - 안 써도 컴파일러가 알아서 넣어줌
	 * 
	 * 인터페이스도 부모급 타입
	 */

	public static final double PI = 3.14;
	int ERROR = -9999999;
	
	public abstract int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	default void describe() {
		System.out.println("계산기를 구현합니다.");
		myMethod();
	}
	
	static int total(int[] arr) {
		int total = 0;
		for(int i : arr) {
			total += i;
		}
		myStaticMethod();
		return total;
	}
	
	private void myMethod() {
		System.out.println("private 메서드 호출");
	}
	private static void myStaticMethod() {
		System.out.println("private static 메서드 호출");
	}
	
}
