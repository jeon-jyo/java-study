package kr.co.interface03;

public class HiMediaClass implements HiMediaInterface {

	@Override
	public void x() {
		System.out.println("x()");
	}
	
	@Override
	public void y() {
		System.out.println("y()");
	}

	@Override
	public void myMethod() {
		System.out.println("myMethod");
	}

}
