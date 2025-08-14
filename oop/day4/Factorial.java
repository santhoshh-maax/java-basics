package day4;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner san = new Scanner(System.in);
		System.out.print("enter number");
		int n = san.nextInt();
		int fact = 1;
		
		for(int i = 1; i <= n; i++) {
			fact*=i;
		}
		System.out.println(fact);
		
		
		

	}

}
