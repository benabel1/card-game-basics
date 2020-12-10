package cards;

import java.util.HashMap;

import enums.CardGlobalPropertyOptions;

public class CardProperties {
	static HashMap<String, CardProperty> cardsGeneralProperties = new HashMap<String, CardProperty>();
	
	public static void addProperty(String key, CardProperty cardpor) {
		if (cardpor != null) {
			cardsGeneralProperties.put(key, cardpor);
			System.out.println("Card property was created");
			cardpor.info();
		}
	}

	public static boolean getPropertyBool(String cardName, CardGlobalPropertyOptions playeonturn) {
		
		if(cardsGeneralProperties.containsKey(cardName)) {
			return tryGetValueBool(cardName, playeonturn);
		}
		
		return false;
	}

	private static boolean tryGetValueBool(String card, CardGlobalPropertyOptions playeonturn) {
		CardProperty cardProperty = cardsGeneralProperties.get(card);
		return cardProperty.getBoll(playeonturn);
	}

	
}
