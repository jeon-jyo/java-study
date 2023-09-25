package kr.co.set03;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		
		/* 중복 허용x / 순서 상관없이 출력 */

		TreeSet<String> treeSet = new TreeSet<String>();
		
		treeSet.add(new String("가"));
		treeSet.add(new String("나"));
		treeSet.add(new String("다"));
		treeSet.add(new String("0"));
		treeSet.add(new String("1"));
		treeSet.add(new String("2"));
		treeSet.add(new String("Apple"));
		treeSet.add(new String("Banana"));
		treeSet.add(new String("Cherry"));
		treeSet.add(new String("Cherry"));
		
		for (String str : treeSet) {
			System.out.print(str + " ");	// 0 1 2 Apple Banana Cherry 가 나 다
		}
		
	}
}
