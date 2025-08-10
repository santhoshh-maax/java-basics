package day3;

import java.util.Scanner;

public class Switch_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner san =  new Scanner(System.in);
		do {
			System.out.print("Please enter a number: ");
			 num = san.nextInt();
			switch(num) {
			case 1:
				System.out.println("You entered num:"+num+" is Monday");
				break;
			
			case 2:
				System.out.println("You entered num:"+num+" is Tuesday");
				break;
			
			case 3:
				System.out.println("You entered num:"+num+"is Wednesday");
				break;
			
			case 4:
				System.out.println("You entered num:"+num+" is Thursday");
				break;
			
			case 5:
				System.out.println("You entered num:"+num+" is Friday");
				break;
			
			case 6:
				System.out.println("You entered num:"+num+" is Saturday");
				break;
			
			case 7:
				System.out.println("You entered num:"+num+" is Sunday");
				break;
			
			default:
			
				System.out.println("wrong entry!");
				break;
			
			
			}	
		}
		while(num > 7 || num == 0);
		
	}

}
