package day4;

import java.util.Scanner;

public class Reverse_no {

	public static void main(String[] args) {
		Scanner san = new Scanner(System.in);
		System.out.print("enter a number to reverse: ");
		int num  = san.nextInt();
		int rev = 0;
		
		while(num > 0) {
			int temp = num%10;
			rev = rev*10 + temp;
			num = num/10;
		}
		System.out.println(rev);
		
		
		// TODO Auto-generated method stub

	}

}
