package kr.co.builder02;
/*
 * 소스를 안에 넣을지 선택하는 칼조네 피자
 */
public class CalzonePizza extends Pizza {

	private final boolean sauceInside;

	public static class Builder extends Pizza.Builder {
		
		// 기본값 - 소스 없음
		private boolean sauceInside = false;
		
		/*
		 * 칼조네 피자는 선택적 매개변수 sauceInside 를 갖고 있으며
		 * 필수값이 없기 때문에 빌더 생성자는 기본생성자
		 */
		
		// 이 함수를 호출해야만 소스를 안에 넣게끔 변경 가능
		public Builder sauceInside() {
			this.sauceInside = true;
			return this;
		}
		
		@Override
		protected Pizza.Builder self() {
			return this;
		}
		@Override
		Pizza build() {
			return new CalzonePizza(this);
		}
		
	}
	
	private CalzonePizza(Builder builder) {
		super(builder);
		this.sauceInside = builder.sauceInside;
	}
	
	@Override
	public String toString() {
		return toppings.toString() + ", sauceInside : " + sauceInside;
	}
	
}
