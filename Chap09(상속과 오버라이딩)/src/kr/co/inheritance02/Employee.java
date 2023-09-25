package kr.co.inheritance02;

public class Employee /* extends Object */ {
	/*
	 * protected : 상속 받은 곳에서 접근 가능
	 */
	protected String name;
	private int age;
	private String phone;
	private String empDate;
	private String dept;
	
	public Employee() { /* super(); */
		System.out.println("Employee 기본 생성자");
	}

	public Employee(String name, int age, String phone, String empDate, String dept) {
		/*
		 * super(); 생략해도 컴파일러가 넣어줌
		 * implementation -> public Object() {} : Class Object is the root of the class hierarchy. Every class has Object as a superclass.
		 */
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.empDate = empDate;
		this.dept = dept;
		System.out.println("Employee 매개변수가 있는 생성자");
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", phone=" + phone + ", empDate=" + empDate + ", dept="
				+ dept + "]";
	}

}
