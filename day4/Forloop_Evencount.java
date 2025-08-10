package day4;

import java.util.Scanner;

public class Forloop_Evencount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner san =  new Scanner(System.in);
		System.out.print("enter the start range: ");
		int a = san.nextInt();
		System.out.print("enter the end  range: ");
		int b = san.nextInt();
		int count = 0;
//		for (int i = a; i <= b; i+=2) {
//			count += 1;
//			
//		}
//		System.out.println(count);
		for (int i = a; i <= b; i++) {
			if(i%2 == 0) {
				count+=1;
			}
		}
		System.out.println(count);
		

	}

}
