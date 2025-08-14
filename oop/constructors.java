package oop;

public class constructors {
	int age;
	String name;
	constructors(){
		System.out.println("default constructor");
	}
	constructors(int age, String name){
		this.age = age; // ponits to the initial value
		this.name = name;
	}
	void display() {
		System.out.println(age+" "+name+" parametersized constructor"); //parameter constructor
	}

	public static void main(String[] args) {
		constructors obj1 = new constructors(); //create obj1 for default
		constructors obj = new constructors(22,"santhosh"); //create obj for parameter constructor
	    obj.display();// display method called

	}

}
