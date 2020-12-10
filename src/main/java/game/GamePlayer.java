package game;

import data.PlayerValues;
import enums.CommonValues;

public class GamePlayer {
	
	protected String playerNickname;
	protected PlayerValues playerValues;
	
	public GamePlayer(String string) {
		this.playerNickname = string;
		playerValues = new PlayerValues(this);
		
		playerValues.setInt(CommonValues.EXTRA_TURNS, 0);
	}

	public boolean hasExtraTurn() {
		return playerValues.getInt(CommonValues.EXTRA_TURNS) > 0;
	}

	public void spendExtraTurn() {
		playerValues.decIntBy(CommonValues.EXTRA_TURNS, 1);
	}

	public boolean isPlayeing() {
		return true;
	}

	public PlayerValues getPlayersValues() {
			return playerValues;
	}
}
