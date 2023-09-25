package kr.co.abstractclass;

public class DeskTop extends Computer {

	@Override
	public void display() {
		System.out.println("DeskTop display()");
	}
	@Override
	public void typing() {
		System.out.println("DeskTop typing()");
	}

	@Override
	public void turnOn() {
		System.out.println("DeskTop turnOn()");
	}
	@Override
	public void turnOff() {
		System.out.println("DeskTop turnOff()");
	}
}
