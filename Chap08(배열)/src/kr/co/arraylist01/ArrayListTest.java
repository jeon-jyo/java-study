package kr.co.arraylist01;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		/*
		 * ArrayList()
		 * 	- 초기 용량이 10인 빈 목록을 생성
		 * ArrayList(int initialCapacity)
		 *  - 지정된 초기 용량으로 비어 있는 목록을 생성
		 */
		ArrayList<Book> library = new ArrayList<>();
		
		library.add(new Book("그림으로 이해하는 네트워크 구조와 기술", "나카오 신지"));
		library.add(new Book("그림으로 이해하는 네트워크 구조와 기술2", "나카오 신지2"));
		library.add(new Book("그림으로 이해하는 네트워크 구조와 기술3", "나카오 신지3"));
		library.add(new Book("그림으로 이해하는 네트워크 구조와 기술4", "나카오 신지4"));

		for(int i = 0; i < library.size(); i++) {
			library.get(i).showInfo();
		}
		
		/*
			그림으로 이해하는 네트워크 구조와 기술, 나카오 신지
			그림으로 이해하는 네트워크 구조와 기술2, 나카오 신지2
			그림으로 이해하는 네트워크 구조와 기술3, 나카오 신지3
			그림으로 이해하는 네트워크 구조와 기술4, 나카오 신지4
		 */
	}
}
