package kr.co.templatmethod02;
/*
 *  Intermediate 중급 레벨
 */
public class IntermediateLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("빠르게 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("jump 합니다.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("**********중급자 레벨**********");
	}

}
