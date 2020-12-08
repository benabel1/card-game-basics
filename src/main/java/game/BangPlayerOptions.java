package game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import stdo.TAB;

/**
 * 	Groups multiple options for specific player at one moment in game
 * 
 * @author Doma
 *
 */
public class BangPlayerOptions {

	public static final String optionlevel = TAB._3;
	
	HashMap<Integer, GamePlayerOption> op;

	private GamePlayer whosOption;
	
	public BangPlayerOptions(GamePlayer player) {
		this.op = new HashMap<Integer, GamePlayerOption>();
		this.whosOption = player;
	}

	public void addOption(int optionCount, GamePlayerOption operation) {
//		System.out.format("Option was added %d %s\n", optionCount, operation.getTextMessage());
		op.put(optionCount, operation);
	}

	public GamePlayerOption getOption(int orderOfOption) {
		return op.get(orderOfOption);
	}

	@Deprecated
	public void addOption(int optionCount, GamePlayerOption operation, String formatInput) {
		op.put(optionCount, operation);
	}

	public GamePlayer getPlayer() {
		return whosOption;
	}

	public int count() {
		return this.op.size();
	}

	public List<Integer> getSortedKeys() {
		
		List<Integer> sortedKeys = new ArrayList<Integer>(op.keySet());
		Collections.sort(sortedKeys);
		
		return sortedKeys;
	}

	/**
	 * Default option is to do not do anything
	 * @return
	 */
	public boolean containsOnlyQuitOption() {
		return op.size() <= 1;
	}

	public List<GamePlayerOption> getPlayerOption() {
		List<GamePlayerOption> options = new ArrayList<GamePlayerOption>();
		for (int i = 0; i < op.size(); i++) {
			options.add(op.get(i));
		}
		return options;
	}
}
