package game.history;

import java.util.ArrayList;
import java.util.List;

import game.Game;
import sequences.GameRound;
import sequences.GameTurn;
import sequences.GameTurnPhase;

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
	
	public void addRound(GameRound round) {
		if (round != null && getRounds() != null) {
			getRounds().add(round);
		}
	}

	public void addAction(GameSingleAction gameSingleAction) {
		if (gameSingleAction != null && getLastTurnPhase() != null) {
			getLastTurnPhase().addAction(gameSingleAction);
		}
	}
	
	public GameRound getLastRound() {
		
		if (getRounds().isEmpty()) {
			return null;
		}
		
		return getRounds().get(getRounds().size());
	}
	public GameTurn getLastTurn() {
		if(getLastRound() == null) {
			return null;
		}
		return getLastRound().getLastTurn();
	}

	public GameTurnPhase getLastTurnPhase() {
		if(getLastTurn() == null) {
			return null;
		} 
		
		return getLastTurn().getLastTurnPhase();
		
	}

	

	
}
