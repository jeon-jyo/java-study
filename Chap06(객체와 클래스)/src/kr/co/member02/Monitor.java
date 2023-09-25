package kr.co.member02;

public class Monitor {
	
	String company;
	int price;
	int year;
	boolean power;	// 전원
	int channel;	// 채널
	
	// 멤버 메서드
	// Monitor 를 켜거나 끄는 기능
	public void power() {
		
		if(power) {
			System.out.println("모니터가 꺼졌습니다.");
			this.power = !power;	// false
		} else {
			System.out.println("모니터가 켜졌습니다.");
			this.power = !power;	// true
		}
	}
	
	public void channelUp() {
		this.channel++;
		System.out.println("현재 채널 : " + this.channel);
	}
	public void channelDown() {
		this.channel--;
		System.out.println("현재 채널 : " + this.channel);
	}

}
