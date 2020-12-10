package stdo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import game.Game;

public class FileLogger {
	
	private static FileLogger looger;

	public static FileLogger newInstance() {
		if(looger == null) {
			looger = new FileLogger(); 
		}
		return looger;
	}

	public static void log(Game game, String text) {
		BufferedWriter writer = null;		
		
		synchronized (newInstance()) {
			try {
				writer = new BufferedWriter(new FileWriter(new File(game.getLogFile()), true));
				
				writer.append(text);
				writer.newLine();
				
				writer.close();
				writer = null;
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			finally {
				if(writer != null) {
					try {
						writer.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
		
	}
	
	//TODO
	public static void logpp(Game game, String text) {
		BufferedWriter writer = null;		
		
		synchronized (newInstance()) {
			try {
				writer = new BufferedWriter(new FileWriter(new File(game.getLogFile()), true));
				
				writer.append(text);
				writer.newLine();
				
				writer.close();
				writer = null;
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			finally {
				if(writer != null) {
					try {
						writer.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
		
	}
}
