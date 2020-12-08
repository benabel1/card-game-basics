package stdo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import game.BangPlayerOptions;
import game.GamePlayerOption;


public class GlobalConsole {

	static GlobalConsole console;
	static BufferedReader reader;

	public GlobalConsole() {
		reader = new BufferedReader(new InputStreamReader(System.in));
	}

	public static GlobalConsole newInstance() {
		if (console == null) {
			console = new GlobalConsole();
		}

		return console;
	}

	public String readLine() throws IOException {

		return reader.readLine();
	}

	public static <T> T selectCOneOptionAmong(List<T> setOfCards, String instructionMsg, String tabOption) {

		int opt = 0;
		if (instructionMsg == null || instructionMsg.isEmpty()) {
			System.out.println("Select one option:");
		} else {
			System.out.println(instructionMsg);
		}

		if (setOfCards == null || setOfCards.isEmpty()) {
			System.err.println("WHY EMPTY?");
			return null;
		}

		for (T card : setOfCards) {
			System.out.format(TAB._3 + "%2d - %s\n", opt, card);
			opt++;
		}
		try {
			String input = newInstance().readLine();
			int index = Integer.parseInt(input);

			return setOfCards.get(index);
		} catch (Exception e) {
			return null;
		}
	}

	public static <T> List<T> selectCMoreOptionAmong(List<T> setOfCards, String instructionMsg, int count,
			String tabOption) {
		List<T> list = new ArrayList<T>();
		List<T> options = new ArrayList<T>(setOfCards);

		int chosen = 0;
		int opt = 0;
		int maxTries = 5;

		if (setOfCards == null) {
			return list;
		}

		if (instructionMsg == null || instructionMsg.isEmpty()) {
			System.out.println(TAB._3 + "Select more option from:");
		} else {
			System.out.println(instructionMsg);
		}

		while (options.size() > 0 && chosen < count && maxTries > 0) {

			System.out.println(TAB._4 + "Select one");
			opt = 0;

			for (T oneOption : setOfCards) {
				System.out.format(TAB._3 + "%2d - %s\n", opt, oneOption);
				opt++;
			}

			try {
				String input = newInstance().readLine();
				int index = Integer.parseInt(input);

				list.add(options.get(index));
				options.remove(index);
				chosen++;
			} catch (Exception e) {
				maxTries--;
			}

		}

		return list;
	}

	/**
	 * Ask question and check if match wanted answer. Default return FALSE
	 * 
	 * @param question
	 * @param wanted
	 * @return
	 */
	public static boolean selectYesOrNo(String question, String wanted) {

		System.out.format("\t\t%s ?[%s]\n", question, wanted);

		try {
			String input = newInstance().readLine();

			return wanted.equals(input);
		} catch (Exception e) {
			return false;
		}
	}

	public static GamePlayerOption chooseOneOption(BangPlayerOptions validOptions) {

		if (validOptions == null) {
			return null;
		}

		try {
			for (Integer key : validOptions.getSortedKeys()) {
				GamePlayerOption op = validOptions.getOption(key);
				// System.out.print(op.getTextMessage());
			}

			String input = newInstance().readLine();

			if ("q".equalsIgnoreCase(input)) {
				return null;
			}
			int key = Integer.parseInt(input);

			return validOptions.getOption(key);
		} catch (Exception e) {
		}
		return null;
	}

}
