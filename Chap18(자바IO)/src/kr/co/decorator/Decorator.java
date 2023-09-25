package kr.co.decorator;
/*
 * 다양한 종류의 커피를 만들기 위해
 * 재료(Decorator) 구현
 * 
 * Decorator Pattern 의 핵심적인 부분
 * Decorator 는 Component 를 상속하며 내부적으로도 가지고 있다가 생성자를 통해 초기화함
 * Decorator 는 생성자의 매개변수로 Component 또는 다른 Decorator 를 받을 수 있게 됨
 * 
 * 상속만을 위해 만들어진 클래스이므로 abstract 를 붙여서 추상 클래스로 만들어줌
 */
public abstract class Decorator extends Coffee {

	Coffee coffee;
	
	public Decorator(Coffee coffee) {
		this.coffee = coffee;
	}
	
	@Override
	public void brew() {
		coffee.brew();
	}

}
