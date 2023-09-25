package kr.co.builder02;

import kr.co.builder02.NewyorkPizza.Size;
import kr.co.builder02.Pizza.Topping;

public class PizzaTest {
	
	public static void main(String[] args) {
		
		/*
		 * NewyorkPizza 의 생성자는 private 이므로 꼭 내부 Builder 를 호출하고
		 * build() 메소드를 호출할 때 자기 자신을 생성하는 new NewyorkPizza 를 호출할 수 있음
		 * 
		 * - NewyorkPizza.Builder(Size.SMALL) 호출 - NewyorkPizza 를 만들 준비
		 * - Builder 에 Size 와 사용할 토핑을 체이닝 방식으로 저장
		 * - build() 메소드로 this(=NewyorkPizza.Builder) 를 넘겨서 super(this); 를 통해
		 *   세팅된 토핑들이 Pizza 의 toppings 로 들어가게 됨 - 토핑을 저장
		 */
		Pizza nyPizza = new NewyorkPizza.Builder(Size.SMALL)
				.addTopping(Topping.HAM)
				.addTopping(Topping.ONION)
				.build();
		System.out.println(nyPizza);
		
		Pizza nyPizza2 = new NewyorkPizza.Builder(Size.LARGE)
				.addTopping(Topping.MUSHROOM)
				.addTopping(Topping.PEPPER)
				.build();
		System.out.println(nyPizza2);
		
		Pizza calzone = new CalzonePizza.Builder()
				.addTopping(Topping.SAUSAGE)
				.addTopping(Topping.ONION)
				.build();
		System.out.println(calzone);
		
		Pizza calzone2 = new CalzonePizza.Builder()
				.addTopping(Topping.MUSHROOM)
				.addTopping(Topping.HAM)
				.addTopping(Topping.PEPPER)
				.sauceInside()
				.build();
		System.out.println(calzone2);
		/*
			[HAM, ONION]
			[PEPPER, MUSHROOM]
			[ONION, SAUSAGE], sauceInside : false
			[HAM, PEPPER, MUSHROOM], sauceInside : true
		 */
		
		/*
		 * 빌더 패턴
		 *  - 가변인수 매개변수를 여러 개 사용 가능
		 *  - 생성 비용이 크지는 않지만 성능에 민감한 상황에서는 문제가 될 수 있음
		 *  - 점층적 생성자 패턴보다는 코드가 장황하여 매개변수가 4개 이상은 되어야 값어치
		 */
	}
}
