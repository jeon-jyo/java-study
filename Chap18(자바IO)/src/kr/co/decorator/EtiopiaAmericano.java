package kr.co.decorator;
/*
 * 에스프레소 커피를 추출할 원두
 * 
 * Coffee(Component)를 상속하여 기반이 될 커피원두들(ConcreteComponent)
 */
public class EtiopiaAmericano extends Coffee {

	@Override
	public void brew() {
		System.out.print("EtiopiaAmericano ");
	}

}
