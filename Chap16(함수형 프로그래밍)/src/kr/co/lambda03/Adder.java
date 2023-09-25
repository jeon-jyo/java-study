package kr.co.lambda03;

import java.util.function.Function;

public class Adder implements Function<Integer, Integer> {
	/*
	 * Function<T, R>
	 * 
	 * T- 함수에 대한 입력 유형
	 * R- 함수 결과의 유형
	 * 
	 * 하나의 인수를 받아들이고 결과를 생성하는 함수
	 * apply() 메서드를 활용
	 */
	
	@Override
	public Integer apply(Integer x) {
		return x + 10;
	}
}
