package kr.co.templatmethod02;

public class Player {

	private PlayerLevel level; /* has a 관계 */
	
	public Player() {
		level = new BeginnerLevel();
		level.showLevelMessage();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}
	public void setLevel(PlayerLevel level) {
		this.level = level;
		this.level.showLevelMessage();
	}

	public void play(int count) {
		level.go(count);
	}
	
}
