package kr.co.templatmethod02;
/*
 *  Beginner 초급 레벨
 */
public class BeginnerLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("**********초심자 레벨**********");
	}

}
