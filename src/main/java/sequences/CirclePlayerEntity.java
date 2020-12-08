package sequences;

import game.GamePlayer;

public class CirclePlayerEntity {

	private GamePlayer myself;
	
	private CirclePlayerEntity onLefGamePlayer;
	private CirclePlayerEntity onRighGamePlayer;
	
	public CirclePlayerEntity(GamePlayer GamePlayer) {
		this.myself = GamePlayer;
	}

	public CirclePlayerEntity getOnLefGamePlayer() {
		return onLefGamePlayer;
	}

	public void setOnLefGamePlayer(CirclePlayerEntity onLefGamePlayer) {
		this.onLefGamePlayer = onLefGamePlayer;
	}

	public CirclePlayerEntity getOnRighGamePlayer() {
		return onRighGamePlayer;
	}

	public void setOnRighGamePlayer(CirclePlayerEntity onRighGamePlayer) {
		this.onRighGamePlayer = onRighGamePlayer;
	}

	public GamePlayer getMyself() {
		return myself;
	}


}
