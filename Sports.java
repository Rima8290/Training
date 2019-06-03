package com.lti.training.day3.Assignment2;




public class Sports {

   private String game;
   private String day;
   private String team;
   private String player;
public String getGame() {
	return game;
}
public void setGame(String game) {
	this.game = game;
}
public String getDay() {
	return day;
}
public void setDay(String day) {
	this.day = day;
}
public String getTeam() {
	return team;
}
public void setTeam(String team) {
	this.team = team;
}
public String getPlayer() {
	return player;
}
public void setPlayer(String player) {
	this.player = player;
}
//Day-enum


	         public void log(String mssg,dayLevel level) {
	    	 switch(level) {
	    	 case MON:
	    		  System.out.println("Day is:"+mssg);
	    		 break;
	    	  case TUE:
	    		  System.out.println("Day is:"+mssg);
	    		 break;
	    		  case WED:
	    		  System.out.println("Day is:"+mssg);
	    		 break;
	    		  case THU:
	    		  System.out.println("Day is:"+mssg);
	    		 break;
	    		  case FRI:
	    		  System.out.println("Day is:"+mssg);
	    		 break;
	    		  case SAT:
	    		  System.out.println("Day is:"+mssg);
	    		 break;
	    		  case SUN:
	    		  System.out.println("Day is:"+mssg);
	    		 
	    		 
	    	      break;
	    	 default  :
	    		 System.out.println(" Error");
	    		 
	    	    
	    	 }
	     }
	

 
   
}
