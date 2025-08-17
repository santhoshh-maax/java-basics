package oop_day2;
interface sum{
	int max = 100;
	//max = 200 cannot reassign the value once declare it consider as final
	void show();
	static void display() {
		System.out.println("displaying..");
	}
	
}
class myclass implements sum{
	public void show() { // create a subclass to call the abstract class show();
		System.out.println("showing");
	}
}

public class Interface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myclass obj = new myclass();
		sum.display(); // to call static class need to use classname.method
		obj.show(); // to call abstract class we can create a class that implement interface then call it by creating  object for the sub class
		System.out.println(obj.max); // print the value in max
	}

}
