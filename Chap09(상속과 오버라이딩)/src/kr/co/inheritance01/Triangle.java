package kr.co.inheritance01;

public class Triangle extends Shape {	/* is a 관계 */

	Point[] point;						/* has a 관계 */
	
	public Triangle() {
		this(new Point(), new Point(50,50), new Point(100,100));
		System.out.println("Triangle 클래스의 기본 생성자 호출");
	}
	
	public Triangle(Point point, Point point2, Point point3) {
		System.out.println("Triangle 클래스의 매개변수 3개 있는 생성자 호출");
		this.point = new Point[] {point, point2, point3};
	}
	
	public Triangle(Point[] point) {
		System.out.println("Triangle 클래스의 매개변수 Point 배열 생성자 호출");
		this.point = point;
	}
	
	@Override
	public void draw() {
		super.draw();
		System.out.println("[Point1] : " + this.point[0].x + ", " + this.point[0].y);
		System.out.println("[Point2] : " + this.point[1].x + ", " + this.point[1].y);
		System.out.println("[Point3] : " + this.point[2].x + ", " + this.point[2].y);
	}
	
}
