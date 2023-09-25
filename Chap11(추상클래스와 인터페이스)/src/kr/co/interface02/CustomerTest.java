package kr.co.interface02;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.login();
		customer.buy();
		customer.sell();
		customer.order();	// Customer order!
		
		// upcasting
		Buy buyer = customer;
		buyer.buy();
		buyer.order();
		
		Sell seller = customer;
		seller.sell();
		buyer.order();
		
		/*
			Customer login~
			Customer Buy
			Customer Sell
			Customer order!
			Customer Buy
			Customer order!
			Customer Sell
			Customer order!
		 */
	}
}
