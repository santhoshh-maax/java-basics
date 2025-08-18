package oop_day3;
// this() can only used in the first line in the constructor.
//can only use n-1 times
class aa{
	int age;
	String name;
	double cgpa;
	int marks;
	aa(int age){ //constructor
		this.age = age; //this points to the age in the declaration.
	}
	
	aa(int age, String name){//constructor
		this.age = age;
		this.name = name;
	}
	
	aa(int age, String name, double cgpa){ //constructor
//		this.age = age;
//		this.name =  name;
		this(age,name); // this will call the two arguments constructor.
		this.cgpa = cgpa;
	}
	
	aa(int age, String name, double cgpa, int marks){ //constructor
//		this.age = age;
//		this.name =  name;
//		this.cgpa = cgpa;
		this(age,name,cgpa); // this will call the 3 arguments constructor in the top.
		this.marks = marks;
	}
	public void display() {
		System.out.println(age);
		System.out.println(name);
		System.out.println(cgpa);
		System.out.println(marks);
	}
}
public class Constructor_overloading {

	public static void main(String[] args) {
		
		new aa(10).display();
		new aa(12, "santhosh").display();
		new aa (23, "sara", 9.0).display();
		new aa(23,"san",8.7,90).display();
	}

}
