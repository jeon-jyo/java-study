package kr.co.inheritance01;
/*
 * 독립 클래스
 */
public class Point {

	int x;
	int y;
	
	public Point() {
		this(0,0);
		System.out.println("Point 클래스의 기본 생성자 호출");
	}
	
	public Point(int x, int y) {
		System.out.println("Point 클래스의 매개변수가 있는 생성자 호출");
		this.x = x;
		this.y = y;
	}
}
