package com.osa.util;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Utility {
	
	
	public static Logger getlog(Class clazz) {
		Logger log=Logger.getLogger(clazz);
		PropertyConfigurator.configure("/GroupOneProject/src/test/resources/log4j.properties");
		
		
		return log;
		
	}

public static Properties pro() {
	return null;
	
	
}
}
