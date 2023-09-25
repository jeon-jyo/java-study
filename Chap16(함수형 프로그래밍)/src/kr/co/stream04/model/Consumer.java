package kr.co.stream04.model;
/*
 * 여행 상품이 있습니다.
 * 여행 비용은 15세 이상은 100만원, 그 이하는 50만원 입니다.
 * 고객 3명이 이 패키지 여행을 떠납니다.
 * 비용 계산과 검색에 대한 연산을 스트림을 활용해서 구현하시오.
 */
public class Consumer {

	private String name;
	private int age;
	private int price;
	
	public Consumer(String name, int age, int price) {
		this.name = name;
		this.age = age;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Consumer [name=" + name + ", age=" + age + ", price=" + price + "]";
	}
	
}
