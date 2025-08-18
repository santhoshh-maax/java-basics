package oop_day3;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner san = new Scanner(System.in);
		System.out.print("enter the size: ");
		int size = san.nextInt();
		int [] arr = new int[size];
		for (int i = 0; i<size;i++) {
			System.out.print("enter the "+(i+1)+"th array element: ");
			arr[i] = san.nextInt();
		}
		
		for(int i =0; i< size; i++) {
			for(int j=0; j<size-i-1;j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("Bubble sorted");
		for (int i = 0; i<size;i++) {
			System.out.print(arr[i]+" ");
//			arr[i] = san.nextInt();
		}
		
		
		
	}

}
