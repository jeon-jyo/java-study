package kr.co.list;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		
		LinkedList<String> myList = new LinkedList<String>();
		myList.add("A");
		myList.add("B");
		myList.add("C");

		// AbstractCollection.toString()
		System.out.println(myList.toString());	// [A, B, C]
		
		myList.add(1, "D");
		System.out.println(myList);				// [A, D, B, C]
		
		// 맨 앞 요소 삭제됨
		myList.remove();
		System.out.println(myList);				// [D, B, C]
	}
}
