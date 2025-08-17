package oop_day2;
 abstract class bike{ //abstract class only show the necessary things
	 abstract void run();
 }
 class honda extends bike{ // extends abstract class
	 void run() {
		 System.out.println("honda bike");
	 }
	 void milege() {
		 System.out.println("40");
	 }
 }

public class abstratc_method {
	public static void main(String args[]) {
		bike obj = new honda (); //bike is a reference and created object for subclass.
		obj.run(); // honda bike only run 
		honda h = new honda(); // need another object then only it will run the milege
		h.milege(); 
		
	}
	
	
	

}
