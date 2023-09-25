package kr.co.overriding;

public class Animal {

	public Animal() {
		super();
		System.out.println("Animal() 기본 생성자 호출");
	}
	
	public void eat() {
		System.out.println("동물이 밥을 먹는다");
	}
}
