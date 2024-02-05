package com.Config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesClass {

	private static FileInputStream propFile;
	private static Properties prop;
	
	
	public static void loadProperties(String propFilePath) {
		try {
			propFile=new FileInputStream(propFilePath);
			prop=new Properties();
			prop.load(propFile);			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static String getProperties(String propertyName) {
		return prop.getProperty(propertyName);
	}
	
}
