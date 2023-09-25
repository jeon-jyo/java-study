package kr.co.cooperation;

public class Subway {
	
	int lineNumber;
	int passengerCount;
	int money;

	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	// 승차
	public void ride(int money) {
		this.money += money;
		this.passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(lineNumber + " 호선 지하철의 승객수는 " + passengerCount
				+ " 명이고, 수입은 " + money + " 원 입니다.");
	}
	
}
