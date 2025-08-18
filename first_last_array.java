package oop_day3;

import java.util.Scanner;

public class first_last_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner san = new Scanner(System.in);
		System.out.print("enter the arraysize: ");
		int n = san.nextInt();
		
		if(n<0) {
			System.out.println("Invalid input");
			return;
		}
		
		int []arr = new int [n];
		for(int i =0; i<n; i++) {
			System.out.print("enter the "+(i+1)+" arraysize: ");
			arr[i] = san.nextInt();
			if(arr[i]<0) {
				System.out.println("invalid input");
				return;
			}
		}
		int max = arr[0];
		int min = arr[0];
		
		for(int i =1;i<n;i++ ) {
			if(arr[i] > max) {
				max = arr[i];
			}
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("min: "+min+" "+"max: "+max);
			
		
		
	}

}
