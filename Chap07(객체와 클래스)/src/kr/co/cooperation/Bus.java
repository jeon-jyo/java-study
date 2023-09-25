package kr.co.cooperation;

public class Bus {
	
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	// 승차
	public void ride(int money) {
		this.money += money;
		this.passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(busNumber + " 번 버스의 승객수는 " + passengerCount
				+ " 명이고, 수입은 " + money + " 원 입니다.");
	}

}
