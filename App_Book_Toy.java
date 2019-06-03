package com.try_assignment;

public class App {
	public static void main(String[] args) {
		    
		 Book b = new Book("Java handbook",99,500,"A classical book on java");
		 Book b1= new Book("Java Unleashed",99,400,"A classical book on java");
		 
		 Toy t = new Toy("RC car",99 ,2500,"RC Car","4-5");
		 Toy t1 = new Toy("Super hero",99 ,500,"Action Figure","5+");
		 double bill1= b.generateBill(40);
		 System.out.println("Total bill amount for ordering 40 copies of "+b.getName() +"is"+bill1);
		 
	}

}
