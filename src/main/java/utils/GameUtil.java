package utils;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


import game.Game;
import game.GamePlayer;

public class GameUtil {

	public static int getActivePlayerCount(Game game) {
		return (int) game.getGamePlayers()
				.stream()
				.filter(p -> p != null)
				.filter(p -> p.isPlayeing())
				.count();
	}
	
	public static int getPlayerMatchConditionCount(Game game, Predicate<? super GamePlayer> predicate) {
		return (int) game.getGamePlayers()
				.stream()
				.filter(p -> p != null)
				.filter(predicate)
				.count();
	}
	
	public static  List<? super GamePlayer> getPlayerMatchConditionList(Game game, Predicate<? super GamePlayer> predicate) {
		return  game.getGamePlayers()
				.stream()
				.filter(p -> p != null)
				.filter(predicate)
				.collect(Collectors.toList());
	}

}
