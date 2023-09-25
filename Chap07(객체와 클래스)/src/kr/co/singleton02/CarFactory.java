package kr.co.singleton02;
/*
 * 자동차공장은 단 하나  == CarFactory 를 싱글톤으로
 * createCar() 자동차를 만드는 메서드
 */

public class CarFactory {

	private CarFactory() {}
	
	private static CarFactory instance = new CarFactory();
	
	public static CarFactory getInstance() {
		if(instance == null)
			instance = new CarFactory();
		return instance;
	}
	
	public void createCar() {
		Car car = new Car();
		System.out.println(car.getCarNum());
	}
	
	public Car createCar2() {
		Car car = new Car();
		return car;
	}
	
}
