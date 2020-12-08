package game;

public class GamePlayer {
	protected String playerNickname;
	
	protected int extraTurns;
	
	public GamePlayer(String string) {
		this.playerNickname = string;
	}

	public boolean hasExtraTurn() {
		return this.extraTurns > 0;
	}

	public void spendExtraTurn() {
		extraTurns--;
	}

	public boolean isPlayeing() {
		return true;
	}
}
