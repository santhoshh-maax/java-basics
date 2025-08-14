package oop;

import java.util.Scanner;

public class reverse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("enter a string: ");
		Scanner san = new Scanner(System.in);
		String word = san.nextLine();
		
		for(int i =word.length()-1; i>=0; i--) {
			char ch = word.charAt(i);	
			System.out.print(ch);
		}
		
		

	}

}
