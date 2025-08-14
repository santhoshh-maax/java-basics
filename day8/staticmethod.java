package day8;

public class staticmethod {
	 static String  collegename = "mountzion";
	 int num = 10;
	 void display(int a) {
		 System.out.println(a+" "+collegename); //concrete method need to create object
	 }
	
	public static void show(int a) { //static method no need to create object 
		staticmethod.collegename="Mount Zion";
		System.out.println(a+" "+collegename);
	  
	}

	public static void main(String[] args) {
		
		staticmethod.show(99);
		staticmethod obj = new staticmethod();
		obj.display(obj.num);
		obj.display(69);
	}

}
