package kr.co.map01;

import java.util.HashMap;
import java.util.Map;

// 문자열에서 문자 하나씩 몇 번 나오는지 출력하시오.
public class MapTest02 {

	public static void main(String[] args) {
		
		String str = "Hello, Himedia";
		
		Map<Character, Integer> countMap = new HashMap<Character, Integer>();
		
		char[] strArray = str.toCharArray();
		for(char c : strArray) {
			if(countMap.containsKey(c)) {
				countMap.put(c, countMap.get(c)+1);
			} else {
				countMap.put(c, 1);
			}
		}
		
		System.out.println("Character Counts");
		for(char c : countMap.keySet()) {
			System.out.println(c + " : " + countMap.get(c));
		}
		/*
			Character Counts
			  : 1
			a : 1
			d : 1
			e : 2
			H : 2
			i : 2
			l : 2
			, : 1
			m : 1
			o : 1
		 */
	}
}
