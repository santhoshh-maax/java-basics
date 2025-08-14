package oop;
class bike{
	void property() {
		System.out.println("honda tvs bmw");
	}
}
class honda extends bike{
	void show() {
		System.out.println("engine is good");
	}
}

public class single_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		honda obj = new honda();
		obj.property();
		obj.show();
		
	}

}
