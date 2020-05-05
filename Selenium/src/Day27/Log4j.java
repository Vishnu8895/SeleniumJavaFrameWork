package Day27;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Log4j is a java based logging framework
 * it is simple flexible and reliable and fast
 * it is configured thought a configuration file like Log4j.xml or Log4j.properties etc..
 * it is a set of key and value pair
 * within a configuration you can define three main components 
 * Loggers
 * Appenders
 * Layouts
 * COnfiguring logging via a file has the advantage that logging can be turned on or off without modifying the application that uses Log4j
 *   
 */


public class Log4j {
	
	private static Logger logger = LogManager.getLogger(Log4j.class);
	
	public static void main(String[] args) {
	
		System.out.println("hello world");
		
		//Log Statement
		
		logger.trace("This is trace massage");
		logger.info("This is an information massage");
		logger.error("This is an error massage");
		logger.warn("This is warning massage");
		logger.fatal("This is fatal massage");
		
		System.out.println("Completed");
	}
}
