package day8;

public class staticvariable {
	int rollno;
	String name;
	static String collegename = "mzcet"; //initialy declare as mzcet
	
	void display(int a,String name) { //only passing rollno and name collegename no not to give because it is static.
		System.out.println( "rollno: "+a+" "+"Student: "+name+" "+"College name: "+collegename);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticvariable obj = new staticvariable (); //create object for acces rollno & name
		staticvariable.collegename = "Mountzion"; //update college name to mountzion
		obj.display(9175,"santhosh");
		obj.display(9789,"subhin");
		obj.display(9564,"shameer");
		obj.display(9234,"chella");
		obj.display(7890,"sundar");
		

	}

}
