package kr.co.decorator;
/*
 * 기본적인 에스프레소 커피에 물을 추가하면 아메리카노,
 * 우유를 추가하면 라떼, 모카 시럽을 추가하면 카페모카가 되는 형식
 * 
 * 커피(Component) 구현
 * 
 * abstract 로 만들어줘서 객체 생성을 하지 않으며 상속을 위한 클래스임을 명시해줌
 */
public abstract class Coffee {

	public abstract void brew();
	
}
