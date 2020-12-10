package game.history;

import cards.CardGameInstance;
import game.GamePlayerOption;
import statt.Statt;

public class GameSingleAction {
	
	protected static final int DEL_COLSPAN_TO_END = 0;
	protected static final String START = "";
	protected static final String END = "";
	
	private CardGameInstance source;
	private GamePlayerOption option;
	private Statt stat;
	
	private TimePoint time;
	
	public static int getDelColspanToEnd() {
		return DEL_COLSPAN_TO_END;
	}

	public CardGameInstance getSource() {
		return source;
	}

	public GamePlayerOption getOption() {
		return option;
	}

	public Statt getStat() {
		return stat;
	}

	public TimePoint getTime() {
		return time;
	}

	public void setSource(CardGameInstance source) {
		this.source = source;
	}

	public void setStat(Statt stat) {
		this.stat = stat;
	}

	public void setTime(TimePoint time) {
		this.time = time;
	}

	public void setSourceOfAction(CardGameInstance source) {
		this.source = source;
	}

	public void setOption(GamePlayerOption option) {
		this.option = option;	
	}
	
	public void setStatt(Statt stat) {
		if (stat != null) {
			this.stat = stat;
		}
	}
	
	public String getTableRowRepresentation() {
		return "GameSingleAction table is implemented";
	}
}
