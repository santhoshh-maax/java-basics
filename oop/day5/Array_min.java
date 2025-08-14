package day5;

import java.util.Scanner;

public class Array_min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner san = new Scanner(System.in);
		System.out.print("Enter Size of array: ");
		int size = san.nextInt();
		int min = 0;
		int arr[] = new int[size];
		for(int i =0; i<size;i++) {
			System.out.print("Enter"+i+"th element: ");
			arr[i] = san.nextInt();		}
			min = arr[0];
		for(int i = 0; i < arr.length; i++) {
		     	//max = arr[0];
			if( min > arr[i]) {
				min = arr[i];
				
			}
		}System.out.print(min);
	}

}
