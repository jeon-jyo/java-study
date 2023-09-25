package kr.co.lambda07;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortCompareTest {

	public static void main(String[] args) {
		/*
		 * 특정 객체의 인스턴스 메서드 참조
		 *  - 클래스명::메서드명
		 */
		List<String> names = Arrays.asList("이순신", "류성룡", "권율");
		Collections.sort(names, String::compareTo);		// 다음 요소랑 비교 -> 오름차순 정렬
		/*
		 * asList(String... a)
		 *  - 여러 요소를 포함하도록 초기화된 고정 크기 목록 만듦
		 *  
		 *  <T> void sort(List<T> list, Comparator<? super T> c) {
		 *  	list.sort(c);
		 *  }
		 *  
		 *  String 클래스
		 *  - public int compareTo(String anotherString)
		 *  
		 */
		System.out.println(names);						// [권율, 류성룡, 이순신]
		
		for(String name : names) {
			System.out.print(name + " ");				// 권율 류성룡 이순신
		}
	}
}
