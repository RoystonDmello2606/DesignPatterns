package Logging;

public enum Level {
	SEVERE("SEVERE"),
	WARNING("WARNING"),
	INFO("INFO"),
	CONFIG("CONFIG"),
	FINE("FINE"),
	FINER("FINER"),
	FINEST("FINEST");
	
	private final String levelName;
	
	Level(String levelName) {
		this.levelName = levelName;
	}
	
	@Override
	public String toString() {
		return this.levelName;
	}
}
