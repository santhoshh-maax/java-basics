package oop_day3;

class vechile{
	int model;
	vechile(){
		System.out.println("vechile constructor");
	}
	vechile(int model){
		this.model = model;
	}
}

class car extends vechile{
	car(){
		super();
	}
	
}

class bike extends vechile{
	bike(int model){
		super(10);
		this.model = model;
		
	}
}
public class Super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new car();
		new bike(101);
		
	}

}
