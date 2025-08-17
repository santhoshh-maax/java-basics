package oop_day2;

interface print{
	void display(); //by default it consider as abstract
}

interface copy{
	void show(); //by default it consider as abstract
}


class xerox implements print,copy{ //create a class to inherite interface
	public void display() { //need to use public so we can asses the display method from interface
		System.out.println("displaying");
	}
	
	public void show() { //need to use public so we can asses the show method from interface
		System.out.println("showing");
	}
}

public class multilevel_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		xerox obj = new xerox();
		
		obj.display();
		obj.show();
	}

}
