//brute force approach
//find the sum of target in the array elements and return the index of the array elements.
package leed_code;

import java.util.Scanner;

public class two_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner san = new Scanner(System.in);
		System.out.print("enter the size of array: ");
		int size = san.nextInt();
		
		int arr [] = new int[size];
		
		for(int i = 0; i < arr.length;i++) {
			System.out.print("enter the"+(i+1)+"array elements: ");
			arr[i] = san.nextInt();
		}
		System.out.print("enter the target value: ");
		int target = san.nextInt();
		boolean found = false;
		 int firstIndex = 0, secondIndex = 0;
		for(int i = 0; i < size; i++) {
			for(int j = i+1; j < size; j++) {
				if(arr[i] + arr[j] == target) {
					 found = true;
					 firstIndex = i;
					 secondIndex = j;
					 break;
					//System.out.println(i+j);
				}
				
			}
		}
		
		if(found) {
			System.out.println(firstIndex+","+secondIndex);
		}
		else {
			System.out.println("not found");
		}
		
		
		

	}

}
