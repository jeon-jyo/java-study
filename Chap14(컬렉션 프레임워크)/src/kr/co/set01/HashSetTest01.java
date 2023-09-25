package kr.co.set01;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest01 {

	public static void main(String[] args) {
		
		/*
		 * String implements Comparable<String>		-> 중복 확인
		 * 
		 * {@code (!a.equals(b) && a.compareTo(b) == 0)} to a sorted.
		 * set that does not use an explicit comparator, the second {@code add} operation returns false.
		 * (and the size of the sorted set does not increase)
		 * because {@code a} and {@code b} are equivalent from the sorted set's.
		 */
		
		/*
		 * 중복 입력한 요소는 한 번만 출력되고, 출력 순서가 입력 순서와 다름
		 */
		Set<String> set = new HashSet<String>();
		
		set.add(new String("가"));
		set.add(new String("나"));
		set.add(new String("다"));
		set.add(new String("0"));
		set.add(new String("1"));
		set.add(new String("2"));
		set.add(new String("Apple"));
		set.add(new String("Banana"));
		set.add(new String("Cherry"));
		set.add(new String("Cherry"));

		// Object.toString()
		System.out.println(set.toString());		// [가, 0, 1, 2, Apple, 다, Cherry, 나, Banana]
	
	}
}
