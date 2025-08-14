package day7;

import java.util.Scanner;

public class add2nosusingcalss {
	
	public int add(int a, int b) {
		int sum = a+b;
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner san = new Scanner(System.in);
		add2nosusingcalss obj = new add2nosusingcalss();
		System.out.print("enter a num: ");
		int num = san.nextInt();
		System.out.print("enter a num2: ");
		int num2 = san.nextInt();
		
		int res = obj.add(num,num2);
		System.out.println("the sum is"+res);
	}

}
