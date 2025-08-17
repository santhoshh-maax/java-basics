package oop_day2;
//blue print of the class
//cannot create object for interface
//static,final,abstract
//to achieve abstract and multiple interface

interface animal{
	void sound(); //it consider as abstract
	
	default void run() {
		System.out.println("running");
	}
	static void eat() {
		System.out.println("eating");
	}
}
class dog implements animal{
	public void sound() {
		System.out.println("wohhh");
	}
}
public class Interface { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		dog obj = new dog();
		obj.sound(); // call the void sound method
		animal.eat(); //call the static method in interface animal
		obj.run(); // with the object we created for dog is inheritance we can also call the abstract method
	}

}
