package com.Log;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Logs {

	public static Logger logg=Logger.getLogger(Logs.class);
	
	public static void  infoMessage(String messsage) {
		
		PropertyConfigurator.configure("Log4j.properties");
		logg.info(messsage);
	}
	
	public static void errorMessage(String message) {
		PropertyConfigurator.configure("Log4j.properties");
		logg.error(message);
	}
	
	public static void warnMessage(String message) {
		PropertyConfigurator.configure("Log4j.properties");
	}
	
}
