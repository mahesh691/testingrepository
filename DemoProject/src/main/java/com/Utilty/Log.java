package com.Utilty;

import org.apache.log4j.PropertyConfigurator;

public class Log {
public static org.apache.log4j.Logger log=org.apache.log4j.Logger.getLogger("Log");
	
	public static void info(String message) {
		PropertyConfigurator.configure("log4j.properties");
		log.info(message);
	}

}
