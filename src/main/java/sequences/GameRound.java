package sequences;

import java.util.ArrayList;
import java.util.List;

public class GameRound {

	protected List<GameTurn> turns;
	private boolean isOver;
	
	public List<GameTurn> getTurns() {
		if(turns == null) {
			turns = new ArrayList<GameTurn>();
		}
		
		return turns;
	}

	public boolean isOver() {
		return isOver;
	}

	public GameTurn getLastTurn() {
		if (getTurns().isEmpty()) {
			
			return null;
		} else {
			return getTurns().get(getTurns().size() - 1);
		}
	}
}
