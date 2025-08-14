package day7;

import java.util.Scanner;

public class upto2decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner san = new Scanner(System.in);
		System.out.print("Enter double value like 22.4535643: ");
		double num = san.nextDouble();
		double truncated = Math.floor(num * 100) / 100;
		System.out.println("only upto 2 decimals");
		System.out.printf("%.2f",truncated);

	}

}
