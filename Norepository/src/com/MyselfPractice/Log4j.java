package com.MyselfPractice;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Log4j {
	
	public static Logger log1=Logger.getLogger(Log4j.class);
	public static void info(String message) {

	PropertyConfigurator.configure("log4j.properties");
	
	log1.info(message);

	}
	
	

}
