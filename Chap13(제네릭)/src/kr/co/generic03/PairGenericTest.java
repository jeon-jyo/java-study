package kr.co.generic03;

import java.util.HashMap;
import java.util.Map;

public class PairGenericTest {

	public static void main(String[] args) {
		
		Pair<String,Integer> pair = new Pair<>("himedia", 2023);
		System.out.println(pair.getKey());
		System.out.println(pair.getValue());
		System.out.println();
		
		// 검색할 때 주로 씀
		Map<String, Integer> maps = new HashMap<String, Integer>();
		maps.put("kor", 90);
		maps.put("eng", 100);
		maps.put("math", 80);
		System.out.println(maps.get("kor"));
		System.out.println(maps.get("eng"));
		System.out.println(maps.get("math"));
		
	}
}
