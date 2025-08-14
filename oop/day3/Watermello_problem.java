package day3;

import java.util.Scanner;

public class Watermello_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner san =  new Scanner(System.in);
		System.out.print("Enter the Weight of WaterMellon: ");
		int w = san.nextInt();
		if(w >=0 && w<= 100) {
			System.out.println("VALID INPUT");// 0-100
			if(w%2 == 0) {
				System.out.println("YES - within the Range");// even number
				System.out.print(w/2+" "+w/2);
				}
			else {
				System.out.println("NO - Not within the Range"); //odd number
			}
		}
		else {
			System.out.println("INVALID INPUT"); //>100
		}
		

	}

}
