package kr.co.inheritance02;

public class RempDTO extends Employee {

	public RempDTO() {
		super();	// 부모 생성자 호출
		System.out.println("RempDTO 기본 생성자");
	}

	/*
	 * Source > Generate Constructors from Superclass...
	 */
	public RempDTO(String name, int age, String phone, String empDate, String dept) {
		super(name, age, phone, empDate, dept);	// 부모 생성자 호출
		System.out.println("RempDTO 매개변수가 있는 생성자");
	}
	
	/*
	 * super()
	 * super()라는 것은, 부모클래스의 생성자를 호출해서 초기화 시키겠다는 의미
	 * 
	 * 자식 클래스의 모든 생성자에는 첫 번째 줄에 super() 문이 자동으로 추가
	 * 단, 생성자에 super()문을 사용하지 않았을 때만 자동으로 추가
	 * 따라서 자식 클래스의 인스턴스를 생성할 때 부모 클래스의 생성자도 함께 호출
	 */
}
