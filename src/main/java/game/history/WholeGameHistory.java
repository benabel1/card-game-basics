package game.history;

import java.util.ArrayList;
import java.util.List;

import game.Game;

/**
 * 
 * @author Martin Blazko
 *
 */

public class WholeGameHistory {
	protected Game game;
	protected List<GameRound> rounds;
	
	public List<GameRound> getRounds() {
		if(rounds == null) {
			rounds = new ArrayList<GameRound>();
		}
		
		return rounds;
	}
}
