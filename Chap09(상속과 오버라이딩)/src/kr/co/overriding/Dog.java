package kr.co.overriding;

public class Dog extends Animal {

	public Dog() {
		super();
		System.out.println("Dog() 기본 생성자 호출");
	}
	
	@Override
	public void eat() {
		System.out.println("멍멍이가 밥을 먹는다");
	}
	
	public void chase() {
		System.out.println("멍멍이가 공을 쫓아간다");
	}

}
