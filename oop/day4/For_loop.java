package day4;

import java.util.Scanner;

public class For_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner san = new Scanner(System.in);
		System.out.print("Please Table you want to print: ");
		
		int s = san.nextInt();
		System.out.println("-		x		-");
		for(int i = 1; i <= 10; i++) {
			System.out.println(s+" x "+i+" = "+s*i);

		}
		
		
		System.out.println("-		x		-");
		}

}
