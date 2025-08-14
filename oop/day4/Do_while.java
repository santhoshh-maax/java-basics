package day4;

import java.util.Scanner;

public class Do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     Scanner san = new Scanner(System.in);
     System.out.print("enter num: ");
     int num = san.nextInt();
     do {
    	 System.out.println(num);
    	 num++;
     }while(num!=11);//it run one time;
     
	}

}
