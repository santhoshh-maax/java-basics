package oop_day3;
class Animal{
	void sound() {
		System.out.println("Animal sound");
	}
}

class dog extends Animal{
	@Override // it will over ride the main method then print the wahhh
	void sound() {
		System.out.println("wahhh");
	}
}

class cat extends Animal{
	@Override
	void sound() {
		System.out.println("meowww");
	}
}
public class override_method {

	public static void main(String[] args) {
		
		Animal a = new dog();
		a.sound(); 
		a = new cat(); 
		a.sound(); 

	}

}
