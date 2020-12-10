package enums;

import java.util.Random;

import cards.CardGameInstance;

import java.util.List;

public class UTIL<T> {

	static Random random = new Random();
	
	public static String util(CardGlobalPropertyOptions ppp) {
		if (ppp != null) {
			return ppp.name();
		}
		return "FUCK";
	}
	
	public static CardGameInstance getRandom(List<CardGameInstance> l) {
		if (l == null || l.isEmpty()) {
			return null;
		}
		return l.get(random.nextInt(l.size()));
	}
}
