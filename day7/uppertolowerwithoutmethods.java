package day7;

import java.util.Scanner;

public class uppertolowerwithoutmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner san = new Scanner(System.in);
		System.out.print("enter the string: ");
		String word = san.nextLine();
		
		for(int i =0; i<word.length();i++) {
			char ch = word.charAt(i);
			if(ch >= 'A' && ch <= 'Z' ) {
				ch+=32;
			}
			else if(ch >= 'a' && ch <= 'z'){
				ch-=32;
			}
			System.out.print(ch);
			
		}

	}

}
