package oop;
class father{
	void property(){
		System.out.println("Cycle");
	}
}	  
class son1 extends father{
	void bike() {
		System.out.println("ZX10r");
	}
}

class son2 extends son1{
	void car() {
		System.out.println("BMW");
	}
}
public class hierarchal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		son2 s2 = new son2();
		son1 s1 = new son1();
		
		s1.property();
		s2.property();

	}

}
