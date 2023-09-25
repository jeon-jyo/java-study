package kr.co.map01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest03 {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		System.out.println("사이즈 : " + map.size());		// 사이즈 : 0
		System.out.println();
		
		map.put("이순신", 95);
		map.put("정도전", 90);
		map.put("신사임당", 100);
		map.put("정도전", 95);
		map.put("이성계", 90);
		
		System.out.println("사이즈 : " + map.size());		// 사이즈 : 4
		System.out.println("값 : " + map.get("정도전"));	// 값 : 95
		System.out.println();
		
		/*
		 * 키가 중복일 때 맨 나중에 저장한 것이 저장됨
		 */
		System.out.println(map);	// {정도전=95, 신사임당=100, 이성계=90, 이순신=95}
		System.out.println();
		
		// map 컬렉션에 있는 key 값만 Set 계열로 바꿈
		Set<String> set = map.keySet();
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			Integer value = map.get(key);
			System.out.println(key + " : " + value);
		}
		System.out.println();
		/*
			정도전 : 95
			신사임당 : 100
			이성계 : 90
			이순신 : 95
		 */
		
		// map.Entry 객체를 대상으로 Set 계열로 바꿈
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + " : " + value);
		}
		System.out.println();
		/*
			정도전 : 95
			신사임당 : 100
			이성계 : 90
			이순신 : 95
		 */
		
		// 전체 객체 삭제
		map.clear();
		System.out.println("사이즈 : " + map.size());		// 사이즈 : 0
		
	}
}
