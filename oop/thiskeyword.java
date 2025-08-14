package oop;

public class thiskeyword {
	void display() {
		System.out.println("then display will print");
	}
	
	void show() {
		
		System.out.println("show will print first");
		this.display();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thiskeyword obj = new thiskeyword();
		
		obj.show();

	}

}
