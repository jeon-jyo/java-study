package kr.co.stream02;

import java.util.Arrays;
import java.util.function.BinaryOperator;

public class StreamAPITest02 {

	public static void main(String[] args) {
		
		String[] cheonho = {"현대 백화점", "E-Mart", "Hi Media", "청년주상복합건물"};
		
		// 1.
		System.out.println(Arrays.stream(cheonho)
				.reduce("", (s1, s2) -> {
					if(s1.getBytes().length >= s2.getBytes().length) {
						return s1;
					} else {
						return s2;
					}
				}));				// 청년주상복합건물
		System.out.println();
		/*
		 * * T reduce(T identity, BinaryOperator<T> accumulator);
		 * 
		 * String reduce(String identity, BinaryOperator<String> accumulator)
		 *  - 스트림의 원소들을 하나씩 소모해가며, 누적 계산을 수행하고 결과값을 리턴하는 메서드
		 *  - 정의된 연산이 아닌 프로그래머가 직접 지정하는 연산을 적용
		 *  - 파라미터 3개
		 *  - T identity : 초기값, 생략 가능
		 *  - BinaryOperator<T> accumulator: 적용할 계산 함수
		 *  - BinaryOperator<U> combiner: 병렬 스트림에서 각 쓰레드 계산 결과를 합치는 함수
		 *  
		 * Interface BinaryOperator<T> extends BiFunction<T,T,T>
		 *  - 같은 타입의 파라미터 2개를 받아 결과값을 리턴하는 functional interface
		 *  - 주로 람다와 메서드 참조를 위해 사용
		 *  - R apply(T t, U u) 구현해야함
		 */
		
		// 2
		String str = Arrays.stream(cheonho).reduce(new CompareString()).get();	// 익명 함수 사용
		System.out.println(str);	// 청년주상복합건물
		
	}
	
}

class CompareString implements BinaryOperator<String> {

	@Override
	public String apply(String s1, String s2) {
		if(s1.getBytes().length >= s2.getBytes().length) {
			return s1;
		} else {
			return s2;
		}
	}
	
}
