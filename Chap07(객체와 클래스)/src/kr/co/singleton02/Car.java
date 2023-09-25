package kr.co.singleton02;
/*
 * serialNum
 */
public class Car {

	private int carNum;
	private static int serialNum = 1000;

	public Car() {
		Car.serialNum++;
		carNum = serialNum;
	}
	
	public int getCarNum() {
		return carNum;
	}
}
