package kr.co.generic06;

public class GenericMethod {

	public static <T,V> double makeRectangle(Point<T,V> point1, Point<T,V> point2) {
		
//		double left = ((Number)point1.getX()).doubleValue();
//		double right = ((Number)point2.getX()).doubleValue();
//		
//		double top = ((Number)point1.getY()).doubleValue();
//		double bottom = ((Number)point2.getY()).doubleValue();
//		
//		double width = right - left;
//		double height = bottom - top;
		
		double leftBottom = ((Number)point1.getX()).doubleValue();
		double rightBottom = ((Number)point2.getX()).doubleValue();
		
		double leftTop = ((Number)point1.getY()).doubleValue();
		double rightTop = ((Number)point2.getY()).doubleValue();
		
		double width = rightBottom - leftBottom;
		double height = leftTop - leftBottom;
		
		return width * height;
	}
	
	public static void main(String[] args) {
		
		Point<Integer, Double> p1 = new Point<Integer, Double>(0, 10.0);
		Point<Integer, Double> p2 = new Point<Integer, Double>(5, 15.0);
		
//		double rect = GenericMethod.makeRectangle(p1, p2);
		double rect = GenericMethod.<Integer, Double>makeRectangle(p1, p2);
		
		System.out.println("사각형 넓이 : " + rect);	// 사각형 넓이 : 50.0
		
	}
	
}
