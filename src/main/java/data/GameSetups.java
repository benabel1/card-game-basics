package data;

import java.util.HashMap;

import game.Game;

public class GameSetups {
	protected Game game;
	
	HashMap<String, Boolean> k1 = new HashMap<String, Boolean>();
	HashMap<String, Integer> k2 = new HashMap<String, Integer>();
	
	public GameSetups(Game game) {
		this.game = game;
		k1 = new HashMap<String, Boolean>();
		k2 = new HashMap<String, Integer>();
	}

	public void setBool(String name, boolean b) {
		k1.put(name, b);	
	}
	
	public void setInt(String name, int b) {
		k2.put(name, b);	
	}

}
