package kr.co.cooperation;
/*
 * 	* 객체 지향 프로그래밍에서 협력
 * 		- 객체 간에는 협력이 이루어짐
 * 		- 협력을 위해서는 필요한 메시지를 전송하고
 * 		  이를 처리하는 기능이 구현되어야 함
 * 		- 매개 변수로 객체가 전달되는 경우가 있음
 */
public class Student {

	String studentName;
	int grade;
	int money;
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	// 버스 승차
	public void takeBus(Bus bus) {
		bus.ride(1250);
		this.money -= 1250;
	}
	
	// 지하철 승차
	public void takeSubway(Subway subway) {
		subway.ride(1300);
		this.money -= 1300;
	}
	
	public void showInfo() {
		System.out.println(studentName + " 님의 남은 돈은 " + money + " 원 입니다.");
	}
	
}
