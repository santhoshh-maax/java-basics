package oop;
class grandpa{
	void display() {
		System.out.println("villa");
	}
}

class dad extends grandpa{
	void property() {
		System.out.println("house");
	}
}
class son extends dad{
	void education() {
		System.out.println("BE CSE");
	}
}
public class multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		son obj = new son();
		obj.display();
		obj.property();
		obj.education();
	}

}
