package day4;

import java.util.Scanner;

public class While_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner san = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = san.nextInt();
		int i = 1;
//		while(n >=1 ) {//reverse
//			System.out.print(n+" ");
//			n--;
//		}
		
		while(i <= n) {
			System.out.println(i);
			i++;
		}
		
		

	}

}
