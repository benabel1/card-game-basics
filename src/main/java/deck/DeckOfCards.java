package deck;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import cards.CardGameInstance;

public class DeckOfCards<T> {

	List<T> listCards;

	public DeckOfCards() {
		listCards = new ArrayList<T>();
	}

	/**
	 * Insert card into deck
	 * 
	 * @param card
	 */
	public void insertCard(T card) {
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
	public T removeRandomCard() {

		Random random = new Random();

		if (isNotEmpty()) {
			int randomInt = random.nextInt(getListCards().size());

			T removedCard = getListCards().get(randomInt);
			getListCards().remove(randomInt);

			return removedCard;
		} else {
			return null;
		}
	}

	public T giveTopCard() {

		if (getListCards().isEmpty()) {
			return null;
		} else {
			T removedCard = getListCards().get(0);
			getListCards().remove(0);

			return removedCard;
		}
	}

	public T giveBottom() {

		if (getListCards().isEmpty()) {
			return null;
		} else {
			T removedCard = getListCards().get(getListCards().size() - 1);
			getListCards().remove(getListCards().size() - 1);

			return removedCard;
		}
	}

	public List<T> getListCards() {
		if (listCards == null) {
			listCards = new ArrayList<T>();
		}
		return listCards;
	}

	public void clearDeck() {
		listCards.clear();
	}

	public void shuffleAnotherDeckIntoThisAndThenClearDiscardDeck(DeckOfCards<T> discardCardDeck) {
		getListCards().addAll(discardCardDeck.getListCards());

		discardCardDeck.clearDeck();
	}

	public void shuffleDeckIntoDeckWithoutClearAnotherOne(DeckOfCards<T> discardCardDeck) {

		while (discardCardDeck.isNotEmpty()) {
			T randomCard = discardCardDeck.removeRandomCard();
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

	public void putCardOnTop(T re) {

		if (re != null) {
			listCards.add(0, re);
		}
	}

	public T removeSpecificCard(Class<? extends CardGameInstance> classs) {
		T removedCard = null;

		if (isNotEmpty()) {

			for (T cardGameInstance : listCards) {
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
