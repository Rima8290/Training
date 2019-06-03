package com.lti.training.day3.version3;

public class LogFactory {
	
	   public static Logger getLoggerInstance() {
		   return new Console_logger();
		   
	   }

}
