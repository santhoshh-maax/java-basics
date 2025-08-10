package day4;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner san = new Scanner(System.in);
		System.out.print("Enter a number: ");
		
		int s =  san.nextInt();
	    //int count = 0;
		for(int i = 1; i <= s; i++) {
			if(s%i == 0) {
				//count+=1;
				System.out.println(i);
				}
		}
		//System.out.println(count);

	}

}
