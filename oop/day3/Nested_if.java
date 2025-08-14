package day3;

import java.util.Scanner;

public class Nested_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner san =   new Scanner(System.in);
		System.out.print("Please enter your age: ");
		int age = san.nextInt();
		if(age >= 18) {
			System.out.println("Your age is "+age+" you are  Eligable for voting");
				if (age >= 24) {
					System.out.println("Your age is "+age+" you  are Eligable for Canditate");
				}
				else {
					System.out.println("you  are not Eligable for Canditate");
				}
		}
		else {
			System.out.println("you are not Eligable");
		}

	}

}
