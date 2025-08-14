package day4;

import java.util.Scanner;

public class Nested_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner san = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = san.nextInt();
		
		while(n>9) {
			int sum = 0;
			while(n>0) {
				int temp = n%10;
				sum = sum+temp;
				n=n/10;
				
			}
			n=sum;
		}
		System.out.println(n);
		

	}

}
