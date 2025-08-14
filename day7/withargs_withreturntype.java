package day7;

import java.util.Scanner;

public class withargs_withreturntype {
	
	public int add(int a, int b) {
		
		return a + b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner san = new Scanner(System.in);
		System.out.print("enter a num: ");
		int num = san.nextInt();
		System.out.print("enter a num2: ");
		int num2 = san.nextInt();
		
		
		withargs_withreturntype obj = new withargs_withreturntype();
		
		System.out.println("the sum is: "+obj.add(num, num2));
		

	}

}
