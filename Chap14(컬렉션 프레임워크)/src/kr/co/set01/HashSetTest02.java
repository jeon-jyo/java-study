package kr.co.set01;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest02 {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		set.add("Apple");
		set.add("Banana");
		set.add("Cherry");
		set.add("Apple");
		set.add("Apple");

		System.out.println(set.size()); 		// 3
		System.out.println(set.toString());		// [Apple, Cherry, Banana]

		for(String element : set) {
			System.out.print(element + " ");	// Apple Cherry Banana 
		}
		System.out.println();
		
		set.remove("Banana");
		System.out.println(set);				// [Apple, Cherry]

		boolean contains = set.contains("Cherry");
		System.out.println(contains);			// true
		
		// 전체삭제
		set.clear();
		
		boolean empty = set.isEmpty();
		System.out.println(empty); 				// true
		System.out.println(set); 				// []
		
	}
}
