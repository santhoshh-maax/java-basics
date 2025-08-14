package day7;

import java.util.Scanner;

public class withargswithoutreturn {
	
	public void add(int a, int b) {
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner san = new Scanner(System.in);
		System.out.println("enter a num: ");
		int num = san.nextInt();
		System.out.println("enter a num2: ");
		int num2 = san.nextInt();
		
		
		withargswithoutreturn obj = new withargswithoutreturn();
		obj.add(num, num2);
		

	}

}
