package kr.co.decorator;

public class CoffeeTest {

	public static void main(String[] args) {
		
		Coffee kenyaAmericano = new KenyaAmericano();
		kenyaAmericano.brew();			// KenyaAmericano
		System.out.println();

		Coffee kenyaLatte = new Latte(kenyaAmericano);
		/*
		 * 1. Latte constructor 의 매개변수로 kenyaAmericano 가 들어감
		 * 2. Latte constructor 내부의 super(coffee) 에 의해서
		 * 	  상위 클래스인 Decorator 의 생성자가 KenyaAmericano 를 매개변수로 가지고 호출
		 * 3. Decorator 는 생성자에서 field 를 초기화하는데
		 *    이 과정에서 필드값이 KenyaAmericano 로 설정
		 * 4. Latte 객체 생성 완료
		 */
		kenyaLatte.brew();				// KenyaAmericano 우유 추가! 
		System.out.println();
		/*
		 * 1. Latte 의 brew() 메서드를 호출하는 과정에서 super.brew() 이 호출됨
		 * 2. super.brew() 에 의해 상위 클래스인 Decorator 의
		 *    brew() 이 호출되며 coffee.brew() 이 실행
		 * 3. Decorator 의 coffee 에는 KenyaAmericano 가 설정되어 있으므로
		 *    KenyaAmericano 의 brew() 이 실행  -> KenyaAmericano 출력
		 * 4. 다시 Latte 로 돌아옴 				-> 우유 추가! 출력
		 */

		/*
		 * 이제 계속 Decorator 를 상속하는 클래스들만 만들어주면
		 * 다양한 종류의 커피를 만들 수 있게 됨
		 * 
		 * 보조 + 기반
		 */
		
		Mocha kenyaMochaLatte = new Mocha(new Latte(kenyaAmericano));
		kenyaMochaLatte.brew();			// KenyaAmericano 우유 추가! 모카 시럽 추가! 
		System.out.println();

		WhippedCream etiopiaWhippedMocha = 
				new WhippedCream(new Mocha(new EtiopiaAmericano()));
		etiopiaWhippedMocha.brew();		// EtiopiaAmericano 모카 시럽 추가! 휘핑 크림 추가! 
	}
}
