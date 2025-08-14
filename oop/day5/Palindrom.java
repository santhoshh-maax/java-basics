package day5;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner san = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = san.nextInt();
		int a = num;
		int rev = 0;
		
		while(num > 0) {
			int temp = num % 10;
			rev = rev *10 + temp;
			num = num / 10;
			
		}
		if(rev == a) {
			System.out.println("The number "+a+" is palindrome");
		}
		else {
			System.out.println("The number " +a+" is not Palindrome");
		}
		
		san.close();

	}

}
