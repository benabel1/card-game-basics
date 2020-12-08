package sequences;

import java.util.ArrayList;
import java.util.List;

import cards.DIRECTION;
import game.GamePlayer;

public class GamePlayerCircle {
	
	List<CirclePlayerEntity> all;
	GamePlayer currect;
	GamePlayer starting;
	
	public GamePlayerCircle() {
		all = new ArrayList<CirclePlayerEntity>();
	}
	
	public GamePlayerCircle(List<GamePlayer> allPlayers) {
		this();
		createCircleStartingWithPlayer(allPlayers, null);
	}
	
	public GamePlayerCircle(List<GamePlayer> allPlayers, GamePlayer startingWith) {
		this();
		createCircleStartingWithPlayer(allPlayers, startingWith);
	}


	private void createCircleStartingWithPlayer(List<GamePlayer> players, GamePlayer startingWith) {
		//staring as original list
		if (players == null) {
			return;
		}
		
		if (startingWith == null) {

			for (int i = 0; i < players.size(); i++) {
				GamePlayer t = players.get(i);
				
				if(t == null) {
					continue;
				}
				
				CirclePlayerEntity circleEntity = new CirclePlayerEntity(t);
				all.add(circleEntity);
			}
			
			for (int i = 0; i < all.size(); i++) {
				CirclePlayerEntity c = all.get(i);
				
				int left = (i - 1 + all.size()) % all.size();
				int right = (i + 1 + all.size()) % all.size();
				
				c.setOnLefGamePlayer(all.get(left));
				c.setOnRighGamePlayer(all.get(right));
			}
		} else {
			int offset = 0;
			
			for (int i = 0; i < players.size(); i++) {
				if (startingWith == players.get(i) ) {
					offset = i;
					break;
				}
			}
			
			for (int i = 0; i < players.size(); i++) {
				GamePlayer  t = players.get(i);
				
				if(t == null) {
					continue;
				}
				
				int position = ((i - offset) + players.size()) % players.size();
				
				CirclePlayerEntity circleEntity = new CirclePlayerEntity(t);
				all.add((position > all.size())? 0: position, circleEntity );
			}
			
			for (int i = 0; i < all.size(); i++) {
				CirclePlayerEntity c = all.get(i);
				
				int left = (i - 1 + all.size()) % all.size();
				int right = (i + 1 + all.size()) % all.size();
				
				c.setOnLefGamePlayer(all.get(left));
				c.setOnRighGamePlayer(all.get(right));
			}
		}
		
		this.starting = all.get(0).getMyself();
	}
	
	public GamePlayer getActivePlayer() {
		return currect;
	}

	public List<CirclePlayerEntity> getAll() {
		return all;
	}

	public void moveToNextPlayer(boolean nextPlayerMustBeAlive, DIRECTION direction) {

				
		//current is NULL, please make him first player in circle
		if (currect == null) {
			currect = this.starting;
			return;
		}
		
		if (currect.hasExtraTurn()) {
			currect.spendExtraTurn();
		}
				
		if(direction == DIRECTION.CLOCKWISE) {
			do {
				moveLeft();
			} while(!isPlay(nextPlayerMustBeAlive));
		}
		
		if(direction == DIRECTION.CLOCKWISE) {
			do {
				moveRight();
			} while(!isPlay(nextPlayerMustBeAlive));
		}
	
	}

	/**
	 * Check contdition if next player MUST BE playing
	 * 
	 * @param nextPlayerMustBeAlive
	 * @return
	 */
	private boolean isPlay(boolean nextPlayerMustBeAlive) {
		return !nextPlayerMustBeAlive || currect.isPlayeing();
	}

	private void moveLeft() {
		CirclePlayerEntity entity = getEntity();
		
		try {
			currect = entity.getOnLefGamePlayer().getMyself();
		}
		catch (Exception e) {
			currect = null;
		}
	}
	
	private void moveRight() {
		CirclePlayerEntity entity = getEntity();
		
		try {
			currect = entity.getOnRighGamePlayer().getMyself();
		}
		catch (Exception e) {
			currect = null;
		}
	}

	private CirclePlayerEntity getEntity() {
		for (CirclePlayerEntity entity : all) {
			if (entity != null && entity.getMyself() == currect) {
				return entity;
			}
		}
		return null;
	}

	public  GamePlayer getNextPlayer( GamePlayer player, boolean b, DIRECTION direction) {
		return null;
	}


}
