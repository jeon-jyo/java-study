package kr.co.constructor04;

public class Car {

	String color;
	String gearType;
	int door;
	
	public Car() {
		// 직접적으로 인스턴스 멤버변수를 초기화
//		this.color = "노랑";
//		this.gearType = "수동";
//		this.door = 4;
		
		// Ctrl + Open Implementation -> Car(String color, String gearType, int door)
		this("검정","자동",2);
	}
	
	public Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}

	@Override
	public String toString() {
		return "Car [color=" + color + ", gearType=" + gearType + ", door=" + door + "]";
	}
	
}
