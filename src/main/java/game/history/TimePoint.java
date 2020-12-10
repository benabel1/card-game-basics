package game.history;

import game.Game;
import sequences.GameRound;
import sequences.GameTurn;
import sequences.GameTurnPhase;

public class TimePoint {
	GameRound round;
	GameTurn turn;
	GameTurnPhase phase;
	
	public TimePoint(Game game) {
		this.round = game.getHistory().getLastRound();
		this.turn = game.getHistory().getLastTurn();
		this.phase = game.getHistory().getLastTurnPhase();
	}
}
