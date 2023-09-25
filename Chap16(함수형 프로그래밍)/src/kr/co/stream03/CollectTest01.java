package kr.co.stream03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectTest01 {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		
		// 스트림의 각 원소를 제곱한 값들이 구성된 새로운 리스트 생성
		List<Integer> squaredNums = numbers.stream()
				.map(n -> n*n)
				.collect(Collectors.toList());	// 앞에서 만들어진 스트림을 list 로 생성
		System.out.println("정수 리스트에서 각 원소를 제곱한 값 : " + squaredNums);	// [1, 4, 9, 16, 25]
		/*
		 * stream.Collectors
		 *  - Stream을 일반적인 List, Set등으로 변경시키는 Stream 메서드
		 */

		/*
		 * Interface Collector<T,A,R>
		 *  - 요소를 컬렉션에 축적하고 다양한 기준에 따라 요소를 요약하는 등
		 *    다양한 유용한 축소 작업을 구현하는 Collector 구현
		 *  - 리듀싱 연산(즉, 컬렉터)을 어떻게 구현할지 제공하는 메서드 집합으로 구성
		 *  - Stream 의 가장 상위, 나머지 Stream 들이 다 상속받음
		 * 
		 * <R, A> R collect(Collector<? super T, A, R> collector);
		 *  - T는 수집될 스트림 항목의 제네릭 형식
		 *  - A는 누적자. 즉 수집 과정에서 중간 결과를 누적하는 객체의 형식
		 *  - R은 수집 연산 결과 객체의 형식(항상 그런 것은 아니지만 대개 컬렉션 형식)
		 */
		/*
		 * collect와 reduce를 이용하면 동일한 기능을 구현할 수 있음
		 *  - collect 메서드는 도출하려는 결과를 누적하는 컨테이너를 바꾸도록 설계된 메서드
		 *  - reduce는 두 값을 하나로 도출하는 불변형 연산
		 *  
		 *  여러 스레드가 동시에 같은 데이터 구조체를 고치면 리스트 자체가 망가져버리므로
		 *  리듀싱 연산을 병렬로 수행할 수 없음, 이럴 때 가변 컨테이너 관련 작업이면서 병렬성을 확보하려면
		 *  collect 메서드로 리듀싱 연산을 구현하는 것이 바람직함
		 */
	}
}
