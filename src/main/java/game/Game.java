package game;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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
	
	protected List<GamePlayer> players;
	
	protected String loggingFile;
	
	public Game() {
		//start of game in 
		started = LocalDateTime.now();
		day = started.toLocalDate();
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

}
