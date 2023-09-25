package kr.co.stream04.travel;

import java.util.ArrayList;
import java.util.List;

import kr.co.stream04.model.Consumer;

public class ConsumerTest {

	public static void main(String[] args) {
		
		Consumer consumerL = new Consumer("이순신", 40, 100);
		Consumer consumerN = new Consumer("나대용", 20, 100);
		Consumer consumerK = new Consumer("권율", 13, 50);
		
		List<Consumer> consumerList = new ArrayList<Consumer>();
		consumerList.add(consumerL);
		consumerList.add(consumerN);
		consumerList.add(consumerK);
		
		// 고객 명단을 출력하시오
		System.out.println("=====고객명단 추가 순서=====");
		consumerList.stream()
			.map(c -> c.getName())	// map 의 파라미터 타입은 Function<T,R> - apply를 구현
			.forEach(s -> System.out.print(s + " "));				// 이순신 나대용 권율
		System.out.println("\n");
		
		// 여행 총 비용을 계산하시오
		System.out.println("=====여행 총 비용=====");
		int total = consumerList.stream()
//				.map(c -> c.getPrice())
//				.mapToInt(n -> n.intValue())
				.mapToInt(c -> c.getPrice())
				.sum();
		System.out.println("총 비용은 " + total + "만원 입니다.");	// 총 비용은 250만원 입니다.
		System.out.println("\n");
		
		// 고객 중 20세 이상인 사람의 이름을 정렬하여 출력하시오
		System.out.println("=====20세 이상 고객=====");
		consumerList.stream()
			.filter(n -> n.getAge() >= 20)
			.map(c -> c.getName())
			.sorted()
			.forEach(c -> System.out.print(c + " "));				// 나대용 이순신
		
	}
}
