package oop_day3;

public class Block {
	{ //default constructor
		System.out.println("Non-static method"); // it wont run unless object is created
	}
	Block(){ //constructor 
		System.out.println("Constructor"); // always run last after the object calling
	}
	static {
		System.out.println("Static block"); //it will run first because it will run while compile
	}

	public static void main(String[] args) {
		
		System.out.println("Main start");
		new Block(); //object for non static block
		System.out.println("Main end");
		new Block();
		
		
		
	}
	{
		System.out.println("Non static-2");
	}
	
	static {
		System.out.println("Static block-2");
		
	}

}
