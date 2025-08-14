package day8;

public class allmethod {
	
	int a = 10;
	static int  b = 2;
	
	void add(int a) { //normal method
		System.out.println("the sum is: "+(a+b));
	}
	
	public  static void sub(int a) { //static method
		int b = 4; //changing the static int b = 4
		System.out.println("the sub is: "+(a-b));
	}
	static {
		System.out.println("hello all...."); //static block it will excuted first
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		allmethod obj = new allmethod(); //create object to acces 
		
		obj.add(obj.a); //10+2 = 12
		allmethod.sub(obj.a); // 10-4 = 6 after change the int b value inside static method 
		allmethod.sub(4); //4-4 = 0
		

	}

}
