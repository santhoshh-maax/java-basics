package day6;

import java.util.Scanner;

public class arraysizeruntime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner san = new Scanner(System.in);
		System.out.print("Enter the Row Size: ");
		int row = san.nextInt();
		System.out.print("Enter the column Size: ");
		int col = san.nextInt();
		int arr [][] = new int [row][col];
		for(int i =0; i< arr.length;i++) {
			for(int j =0; j<arr.length; j++) {
				System.out.print("Enter the value of row "+(i+1)+" column "+(j+1)+": ");
				arr[i][j] = san.nextInt();
			}
			
		}
		System.out.println("Array elements of size: "+row+" X "+col);
		for(int i = 0; i< arr.length; i++) {
			for(int j = 0; j<arr.length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("\n");
		}
	}

}
