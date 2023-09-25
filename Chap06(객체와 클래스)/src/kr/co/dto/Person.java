package kr.co.dto;

public class Person {

	String name;
	int age;
	String phone;
	
	public void play() {
		System.out.println("운동을 한다.");
	}

	public void eat() {
		System.out.println("음식을 먹다.");
	}
	
	public void walk() {
		System.out.println("걷다.");
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", phone=" + phone + "]";
	}
	
}
