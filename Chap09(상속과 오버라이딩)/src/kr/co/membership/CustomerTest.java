package kr.co.membership;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customerL = new Customer();
		customerL.setCustomerId(20230718);
		customerL.setCustomerName("이순신");
		customerL.bonusPoint = 1000;
		customerL.clacPrice(10000);
		System.out.println(customerL.showInfo());
		System.out.println();
		/*
			Customer() 생성자 호출
			clacPrice(int) : [10000 원 지불, 100 포인트 적립]
			이순신 님의 등급은 : SILVER 이며, 보너스 포인트는 1100 입니다.
		 */
		Customer customerS = new Customer(20230719, "신사임당");
		customerS.bonusPoint = 2000;
		customerS.clacPrice(20000);
		System.out.println(customerS.showInfo());
		System.out.println();
		/*
			Customer() 생성자 호출
			Customer(int, String) 생성자 호출
			clacPrice(int) : [20000 원 지불, 200 포인트 적립]
			신사임당 님의 등급은 : SILVER 이며, 보너스 포인트는 2200 입니다.
		 */
		VIPCustomer customerT = new VIPCustomer();
		customerT.setCustomerId(20230720);
		customerT.setCustomerName("탐크루즈");
		customerT.bonusPoint = 5000;
		customerT.clacPrice(50000);
		System.out.println(customerT.showInfo());
		System.out.println();
		/*
			Customer() 생성자 호출
			VIPCustomer() 생성자 호출
			clacPrice(int) : [50000 원 지불, 2500 포인트 적립, 5000 원 할인, 총 45000 원 지불]
			탐크루즈 님의 등급은 : VIP 이며, 보너스 포인트는 7500 입니다.
		 */
		
		VIPCustomer customerH = new VIPCustomer(20230721, "헤일리 앳웰");
		customerH.bonusPoint = 6000;
		customerH.clacPrice(60000);
		System.out.println(customerH.showInfo());
		System.out.println();
		/*
			Customer() 생성자 호출
			Customer(int, String) 생성자 호출
			VIPCustomer(int, String) 생성자 호출
			clacPrice(int) : [60000 원 지불, 3000 포인트 적립, 6000 원 할인, 총 54000 원 지불]
			헤일리 앳웰 님의 등급은 : VIP 이며, 보너스 포인트는 9000 입니다.
		 */
		
/*
 * 부모타입 참조변수 = new 자식타입();
 * 
 *  - 부모급으로 업캐스팅 , 자동 형변환
 *  - 가리키는 것은 부모타입 (기준은 왼쪽)
 *  - 타입은 부모타입이지만 실제 객체는 자식 객체
 */
		Customer customerR = new VIPCustomer();
		customerR.setCustomerId(20230722);
		customerR.setCustomerName("레베카 페르구손");
		customerR.bonusPoint = 7000;
		customerR.clacPrice(70000);
		System.out.println(customerR.showInfo());
		System.out.println();
		/*
			Customer() 생성자 호출
			VIPCustomer() 생성자 호출
			clacPrice(int) : [70000 원 지불, 3500 포인트 적립, 7000 원 할인, 총 63000 원 지불]
			레베카 페르구손 님의 등급은 : VIP 이며, 보너스 포인트는 10500 입니다.
		 */
		Customer customerP = new VIPCustomer(20230723,"사이먼 페그");
		customerP.bonusPoint = 8000;
		customerP.clacPrice(80000);
		System.out.println(customerP.showInfo());
		/*
			Customer() 생성자 호출
			Customer(int, String) 생성자 호출
			VIPCustomer(int, String) 생성자 호출
			clacPrice(int) : [80000 원 지불, 4000 포인트 적립, 8000 원 할인, 총 72000 원 지불]
			사이먼 페그 님의 등급은 : VIP 이며, 보너스 포인트는 12000 입니다.
		 */
	}
}
