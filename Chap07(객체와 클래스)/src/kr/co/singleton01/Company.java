package kr.co.singleton01;

public class Company {

	/*
	 * 인스턴스 단 한 개
	 * static 변수, static 메서드
	 */
	
	// 생성자는 private 으로 선언
	private Company() {}
	
	// 클래스 내부에 유일한 private 인스턴스 생성 (static 참조 변수)
	private static Company instance = new Company();
	
	// 외부에서 유일한 인스턴스를 참조할 수 있는 public 메서드 제공 (static 메서드)
	public static Company getInstance() {
		if(instance == null)
			instance = new Company();
		return instance;
	}
	
}
