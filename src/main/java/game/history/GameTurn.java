package game.history;

import java.util.ArrayList;
import java.util.List;

public class GameTurn {

	protected List<GameTurnPhase> turnPhases;

	public List<GameTurnPhase> getTurnPhases() {
		if(turnPhases == null) {
			turnPhases = new ArrayList<GameTurnPhase>();
		}
		
		return turnPhases;
	}
}
