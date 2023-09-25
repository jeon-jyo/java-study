package kr.co.interface02;

public class Customer implements Buy, Sell {

	@Override
	public void sell() {
		System.out.println("Customer Sell");
	}

	@Override
	public void buy() {
		System.out.println("Customer Buy");
	}

	@Override
	public void order() {
		System.out.println("Customer order!");
	}
	
	public void login() {
		System.out.println("Customer login~");
	}

}
