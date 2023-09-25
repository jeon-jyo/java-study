package kr.co.inheritance01;

public class ShapeTest {

	public static void main(String[] args) {
		
		Circle circle = new Circle();
		circle.draw();
		System.out.println();
		/*
			Point 클래스의 매개변수가 있는 생성자 호출
			Point 클래스의 기본 생성자 호출
			Shape 클래스의 기본 생성자 호출
			Circle 클래스의 매개변수가 있는 생성자 호출
			Circle 클래스의 기본 생성자 호출
			draw()
			색깔 : black
			원점 : (0, 0) / 반지름 : 100
		 */
		Circle circle2 = new Circle(new Point(150,150), 500);
		circle2.draw();
		System.out.println();
		/*
			Point 클래스의 매개변수가 있는 생성자 호출
			Shape 클래스의 기본 생성자 호출
			Circle 클래스의 매개변수가 있는 생성자 호출
			draw()
			색깔 : black
			원점 : (150, 150) / 반지름 : 500
		 */
		Triangle triangle = new Triangle();
		triangle.draw();
		System.out.println();
		/*
			Point 클래스의 매개변수가 있는 생성자 호출
			Point 클래스의 기본 생성자 호출
			Point 클래스의 매개변수가 있는 생성자 호출
			Point 클래스의 매개변수가 있는 생성자 호출
			Shape 클래스의 기본 생성자 호출
			Triangle 클래스의 매개변수 3개 있는 생성자 호출
			Triangle 클래스의 기본 생성자 호출
			draw()
			[Point1] : 0, 0
			[Point2] : 50, 50
			[Point3] : 100, 100
		 */
		Triangle triangle2 = 
				new Triangle(
						new Point(10,10), new Point(20,20), new Point(30,30));
		triangle2.draw();
		System.out.println();
		/*
			Point 클래스의 매개변수가 있는 생성자 호출
			Point 클래스의 매개변수가 있는 생성자 호출
			Point 클래스의 매개변수가 있는 생성자 호출
			Shape 클래스의 기본 생성자 호출
			Triangle 클래스의 매개변수 3개 있는 생성자 호출
			draw()
			[Point1] : 10, 10
			[Point2] : 20, 20
			[Point3] : 30, 30
		 */
		Triangle triangle3 =
				new Triangle(
						new Point[] {
								new Point(10,10), new Point(80,100), new Point(20,100)});
		triangle3.draw();
		/*
			Point 클래스의 매개변수가 있는 생성자 호출
			Point 클래스의 매개변수가 있는 생성자 호출
			Point 클래스의 매개변수가 있는 생성자 호출
			Shape 클래스의 기본 생성자 호출
			Triangle 클래스의 매개변수 Point 배열 생성자 호출
			draw()
			[Point1] : 10, 10
			[Point2] : 80, 100
			[Point3] : 20, 100
		 */
	}
}
