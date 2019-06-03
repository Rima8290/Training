package com.lti.training.day3.version2;

import java.nio.charset.MalformedInputException;
import java.time.LocalDateTime;

/**
 *  A SIMPLE SYSTEM LOGGER IMPLEMENTATION
 *  
 * @author Rima,Riya
 *  vshadmin 1.0
 *
 */
public class Logger {
	//overloading
	public void log(String msg) {
	//System.out.println("[INFO]["+LocalDateTime.now() + "]" +msg);
	log(msg,LogLevel.INFO);	//calling below log function
	}
	     
	         public void log(String msg, LogLevel level) {
	    	 switch(level) {
	    	 case INFO:
	    		  System.out.println("[INFO]["+LocalDateTime.now() + "]" +msg);
	    		 break;
	    	 case WARNING:
	    		 System.out.println("[WARNING] [" + LocalDateTime.now() + "]" +msg);
	    	      break;
	    	 case ERROR:
	    		 System.out.println("[ERROR][" + LocalDateTime.now() + "]" +msg);
	    		 
	    	    
	    	 }
	     }
	

}
