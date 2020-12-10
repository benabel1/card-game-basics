package game;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import game.history.GameSingleAction;
import game.history.WholeGameHistory;
import sequences.GameRound;

/**
 * 
 * @author Martin Blazko
 *
 */
public class Game {
	
	LocalDate day;
	
	LocalDateTime started;
	LocalDateTime ended;
	
	protected String identificationString;
	protected String loggingFile;
	
	protected List<GamePlayer> players;
	
	protected WholeGameHistory hos;
	
	public Game() {
		//start of game in 
		started = LocalDateTime.now();
		day = started.toLocalDate();
		
		hos = new WholeGameHistory();
	}
	
	public void addNewPlayer(GamePlayer addedUniquePlayer) {
		
		if(addedUniquePlayer != null) {
			getGamePlayers().add(addedUniquePlayer);
		}
	}

	public List<GamePlayer> getGamePlayers() {
		
		if(players == null) {
			players = new ArrayList<GamePlayer>();
		}
		
		return null;
	}

	public String getLogFile() {
		return loggingFile;
	}

	public void giveMeNextPlayer() {
		// TODO Auto-generated method stub
		
	}

	public GameRound getRound() {
		
		return hos.getLastRound();
	}

	public void addRound(GameRound round) {
		hos.addRound(round);
	}
	
	public void addAction(GameSingleAction gameSingleAction) {
		hos.addAction(gameSingleAction);
	}

	public WholeGameHistory getHistory() {
		return hos;
	}

}
