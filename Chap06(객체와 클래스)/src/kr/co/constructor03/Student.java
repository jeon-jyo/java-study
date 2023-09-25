package kr.co.constructor03;

public class Student {

	// 제한적으로 바꿀 수 있게 private 변수로 설정
	private String name;
	private int age;
	
	public Student() {
		System.out.println("기본생성자 호출");
	}
	
	public Student(String name) {
		System.out.println("매개변수가 String 만 있는 생성자 호출");
		this.name = name;
	}
	public Student(int age) {
		System.out.println("매개변수가 int 만 있는 생성자 호출");
		this.age = age;
	}
	public Student(String name, int age) {
		System.out.println("매개변수가 String, int 두 개 있는 생성자 호출");
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
}
