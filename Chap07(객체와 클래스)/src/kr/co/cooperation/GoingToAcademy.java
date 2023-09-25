package kr.co.cooperation;

public class GoingToAcademy {
	
	public static void main(String[] args) {
		
		Student studentLee = new Student("이순신", 10000);
		Student studentShin = new Student("신사임당", 50000);
		
		Bus bus342 = new Bus(342);
		Subway subway9 = new Subway(9);
		
		studentLee.takeBus(bus342);
		studentLee.takeBus(bus342);
		studentShin.takeSubway(subway9);
		studentShin.takeSubway(subway9);
		
		studentLee.showInfo();
		studentShin.showInfo();
		bus342.showInfo();
		subway9.showInfo();
		
		/*
			이순신 님의 남은 돈은 7500 원 입니다.
			신사임당 님의 남은 돈은 48700 원 입니다.
			342 번 버스의 승객수는 2 명이고, 수입은 2500 원 입니다.
			9 호선 지하철의 승객수는 1 명이고, 수입은 1300 원 입니다.
		 */
	}
}
