package kr.co.templatmethod02;

public abstract class PlayerLevel {

	public abstract void run();

	public void jump() {
		System.out.println("jump 못합니다.");
	}
	public void turn() {
		System.out.println("turn 못합니다.");
	}

	public abstract void showLevelMessage();
	
	final public void go(int count) {
		run();
		for(int i = 0; i < count; i++) {
			jump();
		}
		turn();
	}

}
