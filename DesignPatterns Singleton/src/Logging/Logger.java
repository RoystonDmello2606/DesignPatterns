package Logging;

import java.util.Date;
import java.util.HashMap;

public class Logger {
	private static Level level;
	private final static String FORMAT = "%s\t%s\t%s";
	
	private static Logger logger;
	
	private Logger(Level level) {
		Logger.level = level;
	}
	
	public static Logger getLogger() {
		return Logger.getLogger(Level.INFO);
	}
	
	public static Logger getLogger(Level level) {
		if (Logger.logger == null) {
			Logger.logger = new Logger(level);
		}
		return Logger.logger;
	}
	
	public static Level getLevel() {
		return level;
	}
	
	public static void setLevel(Level level) {
		Logger.level = level;
	}
	
	public void log(String message) {
		log(Logger.level, message);
	}
	
	public void log(Level level, String message) {
		System.out.println(String.format(Logger.FORMAT, level, new Date(), message));
	}
}
