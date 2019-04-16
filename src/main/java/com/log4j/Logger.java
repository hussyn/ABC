package com.log4j;

import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;

public class Logger {

	//static String configFilename ="user.dir"+"\\log4j.properties";
	static String configFilename ="C:\\Users\\sajjad\\eclipse-workspace-photon-R-win32-x86_64\\zoopla.com\\log4j.properties";
	
	public static void getlogger() {
		PropertyConfigurator.configure(configFilename);
		
	}
}
