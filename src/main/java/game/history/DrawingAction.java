package game.history;


import java.util.List;

import cards.CardGameInstance;
import game.history.GameSingleAction;

public class DrawingAction extends GameSingleAction {

	public List<CardGameInstance> drawn;
	
	public void setDrawn(List<CardGameInstance> l) {
		this.drawn = l;
	}
}
