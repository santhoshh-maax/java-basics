package oop_day2;
class bird{
	bird(){ //no return type mention it will consider as super
		System.out.println("singing");
	}
}

class parrot extends bird{
	parrot(){ //no return type mention it will consider as super
		System.out.println("ki ki");
	}
}
public class superclass_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parrot obj = new parrot();
		

	}

}
