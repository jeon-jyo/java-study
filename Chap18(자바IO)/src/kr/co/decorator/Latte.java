package kr.co.decorator;

public class Latte extends Decorator {
	/*
	 * 상위 클래스에 기본 생성자가 없으면
	 * 하위 클래스에서 매개변수를 가진 생성자로 super() 호출
	 */
	public Latte(Coffee coffee) {
		super(coffee);
	}

	@Override
	public void brew() {
		super.brew();
		System.out.print("우유 추가! ");
	}
	
}
