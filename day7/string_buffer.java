package day7;

public class string_buffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer san = new StringBuffer("hi iam robot");
		System.out.println(san);
		san.insert(6, " not ");
		System.out.println(san);
		san.append(", world");
		System.out.println(san);
		san.delete(7, 10);
		System.out.println(san);
		san.replace(0,3, "HI ");
		System.out.println(san);
		san.reverse();
		System.out.println(san);
		
		
	}

}
