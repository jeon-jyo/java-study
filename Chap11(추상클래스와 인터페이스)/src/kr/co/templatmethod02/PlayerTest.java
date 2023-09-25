package kr.co.templatmethod02;

public class PlayerTest {

	public static void main(String[] args) {
		
		Player player = new Player();
		player.play(1);
		
		PlayerLevel iLevel = new IntermediateLevel();
		player.setLevel(iLevel);
		player.play(2);
		
		PlayerLevel aLevel = new AdvancedLevel();
		player.setLevel(aLevel);
		player.play(3);
		/*
			**********초심자 레벨**********
			천천히 달립니다.
			jump 못합니다.
			turn 못합니다.
			**********중급자 레벨**********
			빠르게 달립니다.
			jump 합니다.
			jump 합니다.
			turn 못합니다.
			**********고급자 레벨**********
			엄청 빠르게 달립니다.
			아주 높이 jump 합니다.
			아주 높이 jump 합니다.
			아주 높이 jump 합니다.
			turn 합니다.
		 */
	}
}
