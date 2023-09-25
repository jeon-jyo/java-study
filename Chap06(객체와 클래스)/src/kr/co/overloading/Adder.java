package kr.co.overloading;

public class Adder {

	/*
	 * 매개변수 개수나 자료형은 다름
	 * 메서드 명은 같음
	 * 리턴타입과 변수명은 상관없음
	 */
	
	// add() 메서드명으로 오버로딩
	
	public int add(int x, int y) {
		System.out.println("add(int x, int y)");
		return x+y;
	}
	// 변수명 달라도 똑같은거로 인식
//	public int add(int c, int d) {
//		System.out.println("add(int c, int d)");
//		return c+d;
//	}
	// 리턴타입 달라도 똑같은거로 인식
//	public double add(int x, int y) {
//		System.out.println("add(int x, int y)");
//		return x+y;
//	}
	
	public long add(int x, long y) {
		System.out.println("add(int x, long y)");
		return x+y;
	}
	
	public double add(double x, double y) {
		System.out.println("add(double x, double y)");
		return x+y;
	}
	
}
