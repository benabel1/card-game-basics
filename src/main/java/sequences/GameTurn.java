package sequences;

import java.util.ArrayList;
import java.util.List;

public class GameTurn {
	
	protected List<GameTurnPhase> turnPhases;
	protected GameRound round;
	
	public GameTurn(GameRound round) {
		this.round = round;
	}
	
	public List<GameTurnPhase> getTurns() {
		if(turnPhases == null) {
			turnPhases = new ArrayList<GameTurnPhase>();
		}
		
		return turnPhases;
	}

	public GameTurnPhase getLastTurnPhase() {
		if(getTurns().isEmpty()) {
			
			return null;
		} else {
			return getTurns().get(getTurns().size() - 1);
		}
		
	}

}
