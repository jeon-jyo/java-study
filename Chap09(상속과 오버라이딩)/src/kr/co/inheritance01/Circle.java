package kr.co.inheritance01;

public class Circle extends Shape {	/* is a 관계 */

	Point center;	// 원점			/* has a 관계 */
	int radius;		// 반지름
	
	public Circle() {
		/*
		 * this() 와 super() 는 { 바로 다음에만 쓸 수 있음
		 *  - 그래서 같이 쓸 수가 없음
		 *  - this() 가 있을 때 먼저 this() 생성자 호출 뒤 super() 자동 호출
		 */
		this(new Point(), 100);
		System.out.println("Circle 클래스의 기본 생성자 호출");
	}

	public Circle(Point center, int radius) {
		/* 
		 * super();
		 *  - Shape() 기본생성자 호출
		 *  - 부모 클래스 객체가 만들어짐
		 */
		System.out.println("Circle 클래스의 매개변수가 있는 생성자 호출");
		this.center = center;
		this.radius = radius;
	}
	
	@Override
	public void draw() {
		super.draw();
		System.out.println("색깔 : " + this.color);
		System.out.println("원점 : (" + this.center.x + ", "
				+ this.center.y + ") / 반지름 : " + this.radius);
	}
	
}
