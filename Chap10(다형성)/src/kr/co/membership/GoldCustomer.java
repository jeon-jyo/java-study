package kr.co.membership;
/*
 *  * 골드고객
 *   - 2% 보너스 포인트 적립
 *   - 물품 구매시 10% 할인
 */
public class GoldCustomer extends Customer {

	double salesRatio;
	
	public GoldCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		this.setCustomerGrade("Gold");
		this.bonusRatio = 0.02;
		this.salesRatio = 0.1;
		System.out.println("GoldCustomer(int, String) 생성자 호출");
	}
	
	@Override
	public int clacPrice(int price) {
		bonusPoint += price * bonusRatio;
		System.out.print("[" + price + " 원 구매, " + (int)(price * salesRatio) + " 원 할인]");
		return price - (int)(price * salesRatio);
	}
}
