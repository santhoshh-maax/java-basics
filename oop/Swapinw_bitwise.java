package assesments.day1;


import java.util.Scanner;

public class Swapinw_bitwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner san = new Scanner(System.in);
		System.out.println("Enter NUmber1: ");
		int a = san.nextInt();
		System.out.print("Enter NUmber1: ");
		int b = san.nextInt();
		System.out.println("-----------------------------");
		System.out.print("Numbers before Swaping:"+a+" "+b);
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("Numbers before Swaping:"+a+" "+b);
		System.out.println("-----------------------------");
		
		
		
		
		

	}

}

