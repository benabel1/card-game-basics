package enums;

/**
 * Enum represents all option for Poker values
 * 
 * @author Martin Blazko
 *
 */
public enum PokerValue {
	
	/**  1 poker value */
	_01(11, "P01"),
	
	/**  2 poker value */
	_02(12, "P02"),
	
	/**  3 poker value */
	_03(13, "P03"),
	
	/**  4 poker value */
	_04(14, "P04"),
	
	/**  5 poker value */
	_05(15, "P05"),
	
	/**  6 poker value */
	_06(16, "P06"),
	
	/**  7 poker value */
	_07(17, "P07"),
	
	/**  8 poker value */
	_08(18, "P08"),
	
	/**  9 poker value */
	_09(19, "P09"),
	
	/** 10 poker value */
	_10(20, "P10"),
	
	/**  1 poker value */
	__J(30, "P20"),
	
	/**  Q poker value */
	__Q(31, "P30"),
	
	/**  K poker value */
	__K(32, "P40"),
	
	/**  A poker value */
	__A(33, "P50"), 
	
	/** NA poker value */
	_NA(00, "P99");
	
	private int relativeOrderValue;
	private String code;
	
	private PokerValue(int value, String code) {
		this.relativeOrderValue = value;
		this.code = code;
	}
	
	public static int valueForHigherorEqualToValueJ() {
		return __J.getRelativeOrderValue();
	}
	
	public boolean isRoyal() {
		return relativeOrderValue >= __J.relativeOrderValue;
	}


	public int getRelativeOrderValue() {
		return relativeOrderValue;
	}

	public String getCode() {
		return code;
	}
}
