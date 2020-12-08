package cards;

/**
 * 
 * @author Martin Blazko
 *
 */
public enum SuiteCardColor {
	
	/** Spades symbol ♠ */
	_SPADES("S-S", "\u2660","♠"),
	
	/** Hearts symbol ♥ */
	_HEARTS("S-H", "\u2665", "♥"),
	
	/** Clubs symbols ♣ */
	_CLUBS("S-C", "\u2663","♣"),
	
	/** Diamonds symbol ♦ */
	_DIAMONDS("S-D", "\u2666", "♦"),
	
	/** NA symbol */
	_NA("S-NA", "?", "?");
	
	private String code;
	private String signUTF8;
	private String stamp;
	
	private SuiteCardColor(String code, String sign, String stamp) {
		this.code = code;
		this.signUTF8 = sign;
		this.stamp = stamp;
	}

	public String getCode() {
		return code.substring(2);
	}

	public String getSignInUTF8() {
		return signUTF8;
	}

	public String getStamp() {
		return stamp;
	}
}
