package cards;


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
	

}