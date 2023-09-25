package kr.co.overriding;

public class Cat extends Animal {

	public Cat() {
		System.out.println("Cat() 기본 생성자 호출");
	}
	
	public void eat() {
		System.out.println("야옹이가 밥을 먹는다");
	}
	
	public void nocturnal() {
		System.out.println("야옹이는 밤에 활동한다");
	}
	
}
