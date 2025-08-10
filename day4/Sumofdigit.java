package day4;

import java.util.Scanner;

public class Sumofdigit {

	public static void main(String[] args) {
		Scanner san = new Scanner(System.in);
		System.out.print("enter the number: ");
		
		int n = san.nextInt();
		int sum = 0;
		int sum2 = 0;
		while(n>0) {
			int temp = n%10; //seperta lastdigit and add in sum 
			sum = sum + temp;
			n = n/10; //after add omite the last digit by /		
			
		}
		while(sum > 0) { // pass sum for while 
			int temp1 = sum%10; //assign new temp1 var 
			sum2 = sum2 + temp1;
			sum = sum/10;
		}
		
		System.out.println("the sum of digits: "+sum2);
		

	}

}
