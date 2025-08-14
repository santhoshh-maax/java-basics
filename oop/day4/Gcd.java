package day4;

import java.util.Scanner;

public class Gcd {

	public static void main(String[] args) {
		Scanner san = new Scanner(System.in);
		System.out.print("Enter  number1: ");
		int a = san.nextInt();
		System.out.print("Enter  number1: ");
		int b = san.nextInt();
		int ans = 0;
		//int temp = 0;
		int min =  (a>b)? a:b;
		for(int i = min; i > 0 ;i--) {
			if(a%i == 0 && b%i == 0) {
				ans=i;
				break;
				
			}
		}
		System.out.println("GCD: "+ans);
		san.close();
	}

}
