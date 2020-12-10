package sequences;

import java.util.ArrayList;
import java.util.List;

import game.history.GameSingleAction;

public class GameTurnPhase {

	protected List<GameSingleAction> actions;
	protected GameTurn turn;
	
	public GameTurnPhase(GameTurn turn) {
		this.turn = turn;
	}
	
	public List<GameSingleAction> getActions() {
		if(actions == null) {
			actions = new ArrayList<GameSingleAction>();
		}
		
		return actions;
	}

	public void addAction(GameSingleAction gameSingleAction) {
		if (gameSingleAction != null) {
			getActions().add(gameSingleAction);
		}
		
	}
}
