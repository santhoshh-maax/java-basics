package day5;

import java.util.Scanner;

public class Array_evenpos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner san = new Scanner(System.in);
		System.out.print("Enter the array Size: ");
		int size = san.nextInt();
		int arr[] = new int[size];
		for(int i =0; i < size; i++) {
			System.out.print("Enter "+i+"th array elements: ");
			arr[i]=san.nextInt();
		}
		System.out.println("Elements of the Array");
		for(int i = 0; i<arr.length;i++) {
			if(i%2 == 0) {
				System.out.print(arr[i]+" ");
			}
			
			
			
		}
		

	}

}
