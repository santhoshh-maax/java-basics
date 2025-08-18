package oop_day3;

public class Foreach {
	public static void add(int ...m) {// it also does over loading variable arguments
		for (int n:m) { //for each loop
			System.out.println(n);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(10);
		add(10,20);
		add(10,20,30);

	}

}
