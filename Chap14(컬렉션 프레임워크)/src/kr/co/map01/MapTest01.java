package kr.co.map01;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {

	public static void main(String[] args) {
		
		// Key, Value 형태의 데이터를 관리하는 Map 객체 생성
		Map<String, Integer> scoreMap = new HashMap<String, Integer>();
		
		// 데이터 추가
		scoreMap.put("이순신", 90);
		scoreMap.put("이방원", 95);
		scoreMap.put("신사임당", 97);
		scoreMap.put("류성룡", 98);
	
		// 데이터 조회
		System.out.println("이순신의 점수 : " + scoreMap.get("이순신"));
		System.out.println("류성룡의 점수 : " + scoreMap.get("류성룡"));
		
		// 데이터 수정
		scoreMap.put("신사임당",100);
		System.out.println("신사임당의 점수 : " + scoreMap.get("신사임당"));	// 신사임당의 점수 : 100
		
		// 데이터 삭제
		scoreMap.remove("이방원");
		System.out.println("이방원의 점수 : " + scoreMap.get("이방원"));		// 이방원의 점수 : null
		System.out.println();
		
		// 전체 데이터 출력
		for(Map.Entry<String, Integer> entry : scoreMap.entrySet()) {
			System.out.println(entry.getKey() + " 의 점수는 " + entry.getValue() + " 입니다.");
		}
		/*
			신사임당 의 점수는 100 입니다.
			류성룡 의 점수는 98 입니다.
			이순신 의 점수는 90 입니다.
		 */
	}
}
