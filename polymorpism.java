package oop_day3;
//method overloading
public class polymorpism {
	
public static int add(int a, int b) {
	return a+b;
}

public static int add(int a, int b, int c) {
	return a+b+c;
}

public static double add(double a, double b, double c) {
	return a+b+c;
}


	public static void main(String[] args) {
		System.out.println(add(2,2));
		System.out.println(add(1,2,3));
		System.out.println(add(1.2,2.4,3.7));
	}

}
