package day4;

import java.util.Scanner;

//public class Primeno {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner san  = new Scanner(System.in);
//		System.out.print("Please enter a number: ");
//		int n = san.nextInt();
//		int count = 0;
//		if(n==1) {
//			System.out.println("Its not a prime number");
//			
//		}
//		else {
//			for(int i = 1; i<=n; i++) {
//				if(n%i == 0) {
//					count+=1;
//				}
//		}
//			if(count <=2) {
//				System.out.println("its a prime number");
//			}
//			else {
//				System.out.println("its not a prime number");
//			}
//		
//		san.close();
//		
//
//	}
//
//	}
//	}
public class Primeno{
	public static void main(String args[]) {
		Scanner san = new Scanner(System.in);
		System.out.print("enter a num: ");
		int n = san.nextInt();
		int count = 0;
		if(n == 0 || n == 1) {
			System.out.println("not a prime");
			
		}
		else {
			for(int i = 2; i <= n; i++) {
				if(n%i == 0) {
					count++;
				}
			}
			if(count == 1) {
				System.out.println("Prime");
			}
			else {
				System.out.println("not a Prime");
			}
		}
	}
}
