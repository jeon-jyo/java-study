package kr.co.membership;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer customerL = new Customer(202308, "이순신");
		Customer customerS = new Customer(202309, "신사임당");
		Customer customerT = new GoldCustomer(202310, "태조이성계");
		Customer customerC = new GoldCustomer(202311, "최영");
		Customer customerK = new VIPCustomer(202312, "김유신", 7777);
		
		customerList.add(customerL);
		customerList.add(customerS);
		customerList.add(customerT);
		customerList.add(customerC);
		customerList.add(customerK);
		System.out.println();
		
		System.out.println("====================고객 정보 출력====================");
		for(Customer customer : customerList) {
			System.out.println(customer.showInfo());
		}
		System.out.println();
		/*
			====================고객 정보 출력====================
			이순신 님의 등급은 : SILVER 이며, 보너스 포인트는 0 입니다.
			신사임당 님의 등급은 : SILVER 이며, 보너스 포인트는 0 입니다.
			태조이성계 님의 등급은 : Gold 이며, 보너스 포인트는 0 입니다.
			최영 님의 등급은 : Gold 이며, 보너스 포인트는 0 입니다.
			김유신 님의 등급은 : VIP 이며, 보너스 포인트는 0 입니다. 담당 직원 번호는 7777 입니다.
		 */
		
		int price = 10000;
		
		System.out.println("====================할인율 계산 출력====================");
		for(Customer customer : customerList) {
			System.out.print(customer.getCustomerName() + " 님 ");
			int sales = customer.clacPrice(price);
			System.out.println(" : 총 " + sales + " 원 지불");
		}
		System.out.println();
		/*
			====================할인율 계산 출력====================
			이순신 님 [10000 원 구매] : 총 10000 원 지불
			신사임당 님 [10000 원 구매] : 총 10000 원 지불
			태조이성계 님 [10000 원 구매, 1000 원 할인] : 총 9000 원 지불
			최영 님 [10000 원 구매, 1000 원 할인] : 총 9000 원 지불
			김유신 님 [10000 원 구매, 1000 원 할인] : 총 9000 원 지불
		 */
		
		System.out.println("====================보너스 포인트 계산 출력====================");
		for(Customer customer : customerList) {
			System.out.println(customer.getCustomerName() + " 님의 보너스 포인트는 현재 "
			+ customer.bonusPoint + " 입니다.");
		}
		System.out.println();
		/*
			====================보너스 포인트 계산 출력====================
			이순신 님의 보너스 포인트는 현재 100 입니다.
			신사임당 님의 보너스 포인트는 현재 100 입니다.
			태조이성계 님의 보너스 포인트는 현재 200 입니다.
			최영 님의 보너스 포인트는 현재 200 입니다.
			김유신 님의 보너스 포인트는 현재 500 입니다.
		 */
	}
}
