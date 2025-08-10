package day3;

public class ConditionalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9;
		if(n == 9) {
			System.out.println("the num "+n+" is = 9");
		}
		if(n > 6) {
			System.out.println("the num "+n+" is > 6");
			
		}
		if(n > 10) {
			System.out.println("the num "+n+" is > 10");// it fails
		}
		else {
			System.out.println("nothing"); //else part executed
		}

	}

}
