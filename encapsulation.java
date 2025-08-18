package oop_day3;
/*data hiding for example banking operation  assign to private get and set method make the method as public*/
class person{
	private int age;
	private String name;
	public void setname(int age,String name) {
		this.age = age;
		this.name = name;
	}
	
	public void getname() {
		System.out.println(age);
		System.out.println(name);
//		return name;
	}
}
public class encapsulation {

	public static void main(String[] args) {
		
		person p = new person();
		p.getname();
		p.setname(22,"santhosh"); // with the set and get method the variable method can access by the main method but it does not know what the variable is.
		p.getname();
//		System.out.println(p.getName());
	}

}
