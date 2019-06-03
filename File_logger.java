package com.lti.training.day3.version2;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class File_logger extends Logger{
	
	//overridding function
	public void log(String msg, LogLevel level) {
		
		try(FileWriter fw = new FileWriter("app.log",true)) {
			switch(level) {
	    	 case INFO:
	    		  fw.write("[INFO]["+LocalDateTime.now() + "]" +msg + "\n");
	    		 break;
	    	 case WARNING:
	    		 fw.write("[WARNING] [" + LocalDateTime.now() + "]" +msg + "\n");
	    	      break;
	    	 case ERROR:
	    		fw.write("[ERROR][" + LocalDateTime.now() + "]" +msg + "\n");
			}
		}
		
		catch(IOException e) {
			e.printStackTrace();
			
			
			
			
			
		}
	
	}

}
