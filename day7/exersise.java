package day7;

public class exersise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer san = new StringBuffer("Hello world");
		san.reverse();
		
		System.out.println(san);
		String a = san.toString();
		String word [] = a.split(" ");
		for(String var : word) {
			System.out.println(var);
		}
	}

}
