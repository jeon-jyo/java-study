package kr.co.decorator;

public class WhippedCream extends Decorator {

	public WhippedCream(Coffee coffee) {
		super(coffee);
	}

	@Override
	public void brew() {
		super.brew();
		System.out.print("휘핑 크림 추가! ");
	}
	
}
