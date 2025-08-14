package Day2;

import java.util.Scanner;

public class Logical_operators {

	public static void main(String[] args) {
		Scanner san = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.print("Enter the number 1: ");
		int num1 = san.nextInt();
		System.out.print("Enter the  number 2: ");
		int num2 = san.nextInt();
		System.out.println(num1==1 && num2==0);
		System.out.println(num1==10 || num2==5);
		System.out.println(!(num1==10) || !(num2==5));
		
	}

}
