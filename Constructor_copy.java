package oop_day3;
class firstcon{
	int id;
	public firstcon(int id) {
		this.id = id;
	}
	
	public firstcon(firstcon secondcon) { //copy the content of the variable
		this.id = secondcon.id;
	}
}

public class Constructor_copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		firstcon first = new firstcon(10);
		firstcon second = new firstcon(first); //creating object for second and assign the first object
		
		System.out.println(first.id);
		System.out.println(second.id); 
		

	}

}
