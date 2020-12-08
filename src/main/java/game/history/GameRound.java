package game.history;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Doma
 *
 */
public class GameRound {
	
	protected WholeGameHistory wholeGameLog;
	protected List<GameTurn> turns;
	
	public List<GameTurn> getTurns() {
		if(turns  == null) {
			turns = new ArrayList<GameTurn>();
		}
		
		return turns;
	}
}
