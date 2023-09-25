package kr.co.lambda03;

import java.util.function.BiFunction;

public class BiFunctionTest {

	public static void main(String[] args) {
		/*
		 * BiFunction<T, U, R>
		 * 
		 * T- 함수에 대한 첫 번째 인수의 유형
		 * U- 함수에 대한 두 번째 인수의 유형
		 * R- 함수의 결과 유형
		 * 
		 * R apply(T t, U u) 메서드를 활용
		 */
		BiFunction<Integer, Integer, Integer> add = (x, y) -> x + y;
		int result = add.apply(100, 200);
		
		System.out.println(result);
	}
}
