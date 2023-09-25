package kr.co.overriding;

public class PolymorTest {

	public static void main(String[] args) {
		
		/*
		 * Upcasting 으로 객체 생성
		 *  - 상속, 재정의(Override), 동적바인딩
		 *  => 다형성 : 상위 클래스가 동일한 메시지로
		 *  			하위 클래스를 서로 다르게 동작시키는 객체지향 원리
		 */
		Animal animal = new Dog();
		animal.eat();
		
		animal = new Cat();
		animal.eat();			// 동적바인딩 : 런타임 시 결정됨

		/*
		 * Downcasting
		 * 
		 * override (재정의) : 동적 바인딩 -- 실행 시점에서 사용될(호출될) 메서드가 결정되는 바인딩
		 * overloading : 정적 바인딩 -- 컴파일 시점에서 사용될(호출될) 메서드가 결정되는 바인딩
		 */
		((Cat)animal).eat();	// 정적바인딩 : 컴파일 시 이미 fixed
		
	}
}
