package cards;

import java.util.HashMap;

import enums.CardGlobalPropertyOptions;

public class CardProperty {

	protected HashMap<String, Integer> intValues;
	protected HashMap<String, Boolean> boolValues;
	
	public CardProperty() {
		init();
	}

	private void init() {
		intValues = new HashMap<String, Integer>();
		boolValues = new HashMap<String, Boolean>();
	}
	
	public void setBool(CardGlobalPropertyOptions lifeStart, boolean value) {
		boolValues.put(lifeStart.name(), value);
	}

	public boolean getBoll(CardGlobalPropertyOptions playeonturn) {
		if (playeonturn != null && boolValues.containsKey(playeonturn.name())) {
			return boolValues.get(playeonturn.name());
		}

		return false;
	}
	
	public void setInt(CardGlobalPropertyOptions lifeStart, int value) {
		intValues.put(lifeStart.name(), value);
	}

	public int getInt(CardGlobalPropertyOptions life) {
		if (life != null && intValues.containsKey(life.name())) {
			return intValues.get(life.name());
		}

		return -1;
	}

	public void info() {
		
		for(String a: boolValues.keySet()) {
			System.out.println(a + " " + boolValues.get(a));
		}
		
		for(String a: intValues.keySet()) {
			System.out.println(a + " " + intValues.get(a));
		}
	}
}
