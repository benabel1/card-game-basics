package data;

import java.util.HashMap;

import enums.CommonValues;
import game.GamePlayer;

public class PlayerValues {
	protected GamePlayer player;
	
	protected HashMap<String, Integer> intValues;
	protected HashMap<String, Boolean> boolValues;
	
	public PlayerValues(GamePlayer player) {
		this.player = player;
		initAllHashes();
	}

	private void initAllHashes() {
		intValues = new HashMap<String, Integer>();
		boolValues = new HashMap<String, Boolean>();
	}

	public void setBool(CommonValues lifeStart, boolean value) {
		boolValues.put(lifeStart.name(), value);
	}

	public boolean getBool(CommonValues key) {
		if (key != null && boolValues.containsKey(key.name())) {
			return boolValues.get(key.name());
		}

		return false;
	}
	
	public void setInt(CommonValues lifeStart, int value) {
		intValues.put(lifeStart.name(), value);
	}

	public int getInt(CommonValues life) {
		if (life != null && intValues.containsKey(life.name())) {
			return intValues.get(life.name());
		}

		return -1;
	}

	public void incIntBy(CommonValues charges, int increment) {
		int oldValue = intValues.get(charges.name());
		int newValue = oldValue + increment;
		
		setInt(charges, newValue);
	}

	public void decIntBy(CommonValues charges, int decrement) {
		int oldValue = intValues.get(charges.name());
		int newValue = oldValue - decrement;
		
		setInt(charges, newValue);
		
	}
}
