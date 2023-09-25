package kr.co.builder02;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;
/*
 * 계층적으로 설계된 클래스와 잘 어울리는 빌더 패턴을 사용한 Pizza 추상 클래스
 */
public abstract class Pizza {
	// 필요한 정보만을 추상 클래스에 작성
	public enum Topping { HAM, ONION, PEPPER, SAUSAGE, MUSHROOM }
	final Set<Topping> toppings;

	// Builder 추상 클래스
	// 피자의 각 요소들을 생성하는데 필요한 추상메서드가 선언된 클래스(인터페이스)
	abstract static class Builder {
		/*
		 * util.EnumSet<Topping>
		 * 열거형과 함께 사용할 수 있는 특수한 집합 구현
		 * 열거형 집합에 있는 모든 요소는 집합이 생성될 때
		 * 명시적으로 또는 암묵적으로 지정된 단일 열거형에서 나와야 함
		 * 
		 * noneOf
		 * 지정한 요소 유형을 사용하여 빈 열거형 집합을 만듦
		 */
		EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);
		
		// 하위 클래스는 이 메서드를 재정의하여 "this"를 반환하도록 해야 함
		// => 형변환 하지 않고도 메서드 연쇄를 지원할 수 있음
		protected abstract Builder self();
		
		/*
		 * Objects.requireNonNull
		 * 지정된 개체 참조가 null이 아닌지 확인
		 */
		// 하위 클래스에서 공통으로 사용할 토핑과 소스 메서드
		public Builder addTopping(Topping topping) {
			toppings.add(Objects.requireNonNull(topping));
			return self();
		}
		public Builder sauceInside() {
			return self();
		}

		// 오버라이드 하여 사용할 수 있게 처리
		// 최종적으로 토핑과 소스 포함한 피자를 만듦
		abstract Pizza build();
	}
	
	// Pizza를 상속받은 클래스는 자기 자신의 생성자에서 부모인 Pizza의 Builder클래스를 전달해야 함
	// => 부모의 Builder 클래스를 상속받는 또 다른 Builder 클래스를 각각 만듦
	public Pizza(Builder builder) {
		this.toppings = builder.toppings.clone();
	}
	
	@Override
	public String toString() {
		return toppings.toString();
	}
	
}
