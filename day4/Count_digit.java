package day4;

import java.util.Scanner;

public class Count_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner san = new Scanner(System.in);
		System.out.print("enter the digit: ");
		int s = san.nextInt(); //123 divise use panna last digit delet agidum;
		//int i = 0;
		int count = 0;
		while(s>0) { //123 > 0 true iteration 2 //12 iteration 3 //1
			s=s/10;
				//(123 / 10) = (12/10) = 1 // (1/10) = 0
			count++; // 1+1+1
			
			
		}
		System.out.println("the count: "+count);
		san.close();
	}

}
