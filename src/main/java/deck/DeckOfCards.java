package deck;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import cards.CardGameInstance;

public class DeckOfCards {

	List<CardGameInstance> listCards;

	public DeckOfCards() {
		listCards = new ArrayList<CardGameInstance>();
	}

	/**
	 * Insert card into deck
	 * 
	 * @param card
	 */
	public void insertCard(CardGameInstance card) {
		if (getListCards() != null && card != null) {
			getListCards().add(card);
		}
	}

	public boolean isNotEmpty() {
		return getListCards() != null && getListCards().isEmpty() == false;
	}

	/**
	 * If deck is not empty, remove one random card from it and return removed card
	 * 
	 * If it is empty, return null
	 * 
	 * @return
	 */
	public CardGameInstance removeRandomCard() {

		Random random = new Random();

		if (isNotEmpty()) {
			int randomInt = random.nextInt(getListCards().size());

			CardGameInstance removedCard = getListCards().get(randomInt);
			getListCards().remove(randomInt);

			return removedCard;
		} else {
			return null;
		}
	}

	public CardGameInstance giveTopCard() {

		if (getListCards().isEmpty()) {
			return null;
		} else {
			CardGameInstance removedCard = getListCards().get(0);
			getListCards().remove(0);

			return removedCard;
		}
	}

	public CardGameInstance giveBottom() {

		if (getListCards().isEmpty()) {
			return null;
		} else {
			CardGameInstance removedCard = getListCards().get(getListCards().size() - 1);
			getListCards().remove(getListCards().size() - 1);

			return removedCard;
		}
	}

	public List<CardGameInstance> getListCards() {
		if (listCards == null) {
			listCards = new ArrayList<CardGameInstance>();
		}
		return listCards;
	}

	public void clearDeck() {
		listCards.clear();
	}

	public void shuffleAnotherDeckIntoThisAndThenClearDiscardDeck(DeckOfCards discardCardDeck) {
		getListCards().addAll(discardCardDeck.getListCards());

		discardCardDeck.clearDeck();
	}

	public void shuffleDeckIntoDeckWithoutClearAnotherOne(DeckOfCards discardCardDeck) {

		while (discardCardDeck.isNotEmpty()) {
			CardGameInstance randomCard = discardCardDeck.removeRandomCard();
			listCards.add(randomCard);
		}
	}

	public int count() {
		return listCards.size();
	}

	public CardGameInstance returnCard(CardGameInstance cardTobeReturned) {

		if (listCards.contains(cardTobeReturned)) {
			listCards.remove(cardTobeReturned);

			return cardTobeReturned;
		} else {
			return null;
		}

	}

	public void putCardOnTop(CardGameInstance re) {

		if (re != null) {
			listCards.add(0, re);
		}
	}

	public CardGameInstance removeSpecificCard(Class<? extends CardGameInstance> classs) {
		CardGameInstance removedCard = null;

		if (isNotEmpty()) {

			for (CardGameInstance cardGameInstance : listCards) {
				if (cardGameInstance.getClass().equals(classs)) {
					removedCard = cardGameInstance;
				}
			}
			
			listCards.remove(removedCard);
			
			return removedCard;
		}else {
			return null;
		}
	}

}
