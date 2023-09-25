package kr.co.builder02;
/*
 * size 를 필수로 받는 뉴욕 피자
 */
public class NewyorkPizza extends Pizza {

	public enum Size { SMALL, MEDIUM, LARGE }
	private final Size size;

	public static class Builder extends Pizza.Builder {

		// 필수 - size 매개변수
		private final Size size;
		
		public Builder(Size size) {
			this.size = size;
		}
		
		// Pizza.Builder 가 반환값이지만 상속받은 자기 자신의 Builder 를 반환
		// => return this 는 NewyorkPizza.Builder 클래스
		// 뉴욕 피자 본인 반환
		@Override
		protected Pizza.Builder self() {
			return this;
		}

		// NewyorkPizza 를 생성할 수 있는 new NewyorkPizza(this) 를 호출
		// => 자기 자신의 생성자를 호출
		// 구체하위클래스인 NewyorkPizza 반환하도록 선언
		@Override
		Pizza build() {
			return new NewyorkPizza(this);
		}
		
	}

	// private 생성자 - build 함수에서 호출됨
	private NewyorkPizza(Builder builder) {		// 이너클래스 타입
		super(builder);
		this.size = builder.size;
	}
	/*
	 * 공변 반환 타이핑
	 * 하위 클래스의 메서드가 상위 클래스의 메서드가 정의한 반환 타입이 아닌,
	 * 그 하위 타입을 반환하는 기능
	 */
}
