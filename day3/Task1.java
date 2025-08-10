package day3;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner san = new Scanner(System.in);
		System.out.print("Enter the number please: ");
		int n = san.nextInt();
		
		if(n%3 == 0 && n%5 == 0) {
			System.out.println("Fizz-Bizz");
		}
		else if (n%3 == 0) {
			System.out.println("Fizz");
		}
		else if(n%5 == 0) {
			System.out.println("Bizz");
		}

		else {
			System.out.println("no Fizz-Bizz");
		}
		
	}

}
