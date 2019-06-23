package Client;

import Logging.Level;
import Logging.Logger;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger logger = Logger.getLogger(Level.WARNING);
		Logger logger2 = Logger.getLogger();
		
		System.out.println(logger);
		System.out.println(logger2);
		
		logger.log("Sample warning log message");
		
		logger.setLevel(Level.INFO);
		
		logger.log("Sample info message");
		
		logger.log(Level.CONFIG, "Sample config message");
	}
}
