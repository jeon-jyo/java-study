package kr.co.collection;

import java.util.ArrayList;

public class ListLab {

	public static void main(String[] args) {
		
		/*
		 * 컬렉션은 값이 아니고 주소값 참조번지
		 * 가리키는 곳에 데이터가 있다
		 */
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("banana");
		list.add("cherry");
		list.add("banana");
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println();
		/*
			apple
			banana
			cherry
			banana
		 */
		
		list.remove(0);
		for(String str : list) {
			System.out.print(str + " ");	// banana cherry banana
		}
		System.out.println();

		list.set(0,"orange");
		for(String str : list) {
			System.out.print(str + " ");	// orange cherry banana
		}
		
	}
}
