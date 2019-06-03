package com.lti.training.day3.version2;

public class App {
	
	  public static void main(String[] args) {
		  // testing our logger
		 //Console
		/* Console_logger l= new Console_logger();
		 l.log("App Started Successfully"); // overloading
		  l.log("Some Message",LogLevel.INFO);
		  l.log("Again Some Message",LogLevel.WARNING);
		  l.log("Some Critical Message",LogLevel.ERROR); */
		  //File
		 File_logger l= new File_logger();
		  l.log("App Started Successfully"); // overloading
		  l.log("Some Message",LogLevel.INFO);
		  l.log("Again Some Message",LogLevel.WARNING);
		  l.log("Some Critical Message",LogLevel.ERROR);

	}

}
