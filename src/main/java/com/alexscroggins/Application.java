package com.alexscroggins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Example application demonstrating the Maven assembly plugin.
 */
public class Application {
	
	private static final Logger logger = LoggerFactory.getLogger(Application.class);
	
	public static void main(String[] arguments) {
		logger.info("Example application");
		logger.debug("Press Ctrl+C to exit.");
		
		try {
			while (true) { Thread.sleep(1000L); }
		} catch (InterruptedException e) {
			logger.info("Shutting down example application.");
		}
	}
}
