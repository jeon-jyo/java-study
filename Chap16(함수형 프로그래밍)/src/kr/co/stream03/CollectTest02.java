package kr.co.stream03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectTest02 {

	public static void main(String[] args) {
		
		List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry", "Orange");
		
		// 스트림의 각 원소를 대문자로 변환한 값들의 새로운 리스트 생성
		List<String> uppercase = fruits.stream()
			.map(word -> word.toUpperCase())	// map 에 대문자로 구현
			.collect(Collectors.toList());
		System.out.println("스트림의 문자열 원소를 대문자로 변환 : " + uppercase); // [APPLE, BANANA, CHERRY, ORANGE]
		
		for(String str : uppercase) {
			System.out.println(str);
		}
		/*
			APPLE
			BANANA
			CHERRY
			ORANGE
		 */
	}
}
