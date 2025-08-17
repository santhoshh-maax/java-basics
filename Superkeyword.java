package oop_day2;
// to refer immitiate  parent class
class pets{
	String color = "Blue";
}

class cat extends pets{
	String color = "Red";
	void display() {
		System.out.println(super.color);
		System.out.println(color);
		
		
	}
}
public class Superkeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		cat obj = new cat();
		obj.display();
		

	}

}
