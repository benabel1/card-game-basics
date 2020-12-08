package sequences;

import java.util.List;

import game.GamePlayer;

/**
 * 
 * @author Doma
 *
 */
public class PlayersRoundSequencer {
	
	GamePlayerCircle circle;
	
	public PlayersRoundSequencer(List<GamePlayer> allPlayers) {
		circle = new GamePlayerCircle(allPlayers);
	}
	
	public PlayersRoundSequencer(List<GamePlayer> allPlayers, GamePlayer startingPlayer) {
		circle = new GamePlayerCircle(allPlayers);
	}

}
