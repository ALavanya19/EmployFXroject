package com.Config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesClass {

	
	
	private static FileInputStream propFilePath;
	private static Properties prop;
		
	public static void loadPropeties(String filePath) throws IOException {
		
		propFilePath=new FileInputStream(filePath);
		prop=new Properties();
		prop.load(propFilePath);
		
	}
	
	public static String getProperties(String propertyName) {
		
		return prop.getProperty(propertyName);
	}
}
