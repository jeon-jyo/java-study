package kr.co.stream01;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class ArrayListStream {

	public static void main(String[] args) {
		
		List<String> sList = new ArrayList<String>();
		sList.add("[이순신 장군]");
		sList.add("[나대용 구선 제작자]");
		sList.add("[권율]");

		Stream<String> stream = sList.stream();
		stream.forEach(s -> System.out.print(s + "\t"));					// [이순신 장군]	[나대용 구선 제작자]	[권율]
		System.out.println();
		/*
		 * Stream<String> Collection.stream()
		 * 
		 * void forEach(Consumer<? super String> action)
		 */

		sList.stream().sorted().forEach(s -> System.out.print(s + "\t"));	// [권율]	[나대용 구선 제작자]	[이순신 장군]
		System.out.println();
		/*
		 * Stream<String> sorted()
		 */
		
		sList.stream().map(s -> s.length()).forEach(n -> System.out.print(n + " "));				// 8 12 4	
		System.out.println();
		/*
		 * * <R> Stream<R> map(Function<? super T, ? extends R> mapper);
		 * 
		 * <Integer> Stream<Integer> map(Function<? super String, ? extends Integer> mapper)
		 *  - 이 스트림의 요소에 주어진 함수를 적용한 결과로 구성된 스트림을 반환
		 *  - 중간 작업
		 *  - Type 매개변수: <R> 새 스트림의 요소 유형
		 */
		
		sList.stream().filter(s -> s.length() >= 10).forEach(s -> System.out.println(s + "\t"));	// [나대용 구선 제작자]
		/*
		 * * Stream<T> filter(Predicate<? super T> predicate);
		 * 
		 * Stream<String> filter(Predicate<? super String> predicate)
		 */
	}
}
