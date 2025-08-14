package day3;

import java.util.Scanner;

public class Grade_System {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner san = new Scanner(System.in);
		System.out.print("Please enter the mark broo! ");
		int m = san.nextInt();
		System.out.println("|--------------------------------------------|");
		System.out.println("|     Thanks for entered your marks✅        |");
		System.out.println("|--------------------------------------------|");
		System.out.println("| Welcome to Students portal Akka university |");
		System.out.println("|--------------------------------------------|");
		if(m >= 90 && m <=100 ) {
			System.out.println("	      Your Grade is A+ 		");
			
		}
		else if (m >= 80 && m <=89 ) {
			System.out.println("		  Your Grade is A		  ");
			
		}
		else if(m >= 70 && m <= 79) {
			System.out.println("	 	  Your Grade is B		  ");
			
		}
		else if(m >= 60 && m <= 69) {
			System.out.println("		  Your Grade is C		  ");
			
		}
		else if( m >= 50 && m <= 59) {
			System.out.println("		  Your Grade is D		");
			
		}
		else {
			System.out.println(" You are Fail! better luck next time👍 ");
			
		}
		System.out.println("|--------------------------------------------|");
	}

}
