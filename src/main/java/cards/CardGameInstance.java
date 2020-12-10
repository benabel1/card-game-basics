package cards;


import java.util.List;

import enums.CardGlobalPropertyOptions;
import game.Game;
import game.GamePlayer;
import game.GamePlayerOption;
import game.history.TimePoint;
import stdo.TAB;


public class CardGameInstance {

	private static final String DEFAULT_CODE = "UC";

	public static final String PLAYING_CARD_TAB = TAB._3;
	public static final String PLAYING_CARD_TAB_DETAILS = TAB._4;
	public static final String PLACING_CARD_TAB = TAB._3;
	public static final String INFO_L2 = TAB._2;

	protected String cardName;
	protected String description;

	protected String cardTextENG;
	protected String cardTextSVK;
	protected String cardTextCZE;
	
	protected String cardNameForBackSite;
	protected String descriptionForBackSite;

	protected String cardTextENGForBackSite;
	protected String cardTextSVKForBackSite;
	protected String cardTextCZEForBackSite;
	
	protected double cardValue;
	
	TimePoint lastPlayed;
	
	public static String getDefaultCode() {
		return DEFAULT_CODE;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCardTextENG() {
		return cardTextENG;
	}

	public void setCardTextENG(String cardTextENG) {
		this.cardTextENG = cardTextENG;
	}

	public String getCardTextSVK() {
		return cardTextSVK;
	}

	public void setCardTextSVK(String cardTextSVK) {
		this.cardTextSVK = cardTextSVK;
	}

	public String getCardTextCZE() {
		return cardTextCZE;
	}

	public void setCardTextCZE(String cardTextCZE) {
		this.cardTextCZE = cardTextCZE;
	}

	public boolean getBoolProperty(CardGlobalPropertyOptions playeonturn) {
		if (playeonturn == null) {
			return false;
		}
		
		return CardProperties.getPropertyBool(getCardName(), playeonturn); 
	}
	
	public void wasPlayed(Game game, GamePlayer byWhom) {}
	
	public void wasPlayed(Game game, GamePlayer byWhom, GamePlayerOption option) {}
	
	public void wasPlayed(Game game, GamePlayer byWhom, GamePlayer targeting) {}
	
	public void wasPlayed(Game game, GamePlayer byWhom, GamePlayer targeting, GamePlayerOption option) {}
	
	public void wasPlayed(Game game, GamePlayer byWhom, List<GamePlayer> affecting) {}
	
	public void wasPlayed(Game game, GamePlayer byWhom, List<GamePlayer> affecting, GamePlayerOption option) {}

}