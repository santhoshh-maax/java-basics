//
//You are given row x col grid representing a map where grid[i][j] = 1 represents land and grid[i][j] = 0 represents water.
//
//Grid cells are connected horizontally/vertically (not diagonally). The grid is completely surrounded by water, and there is exactly one island (i.e., one or more connected land cells).
//
//The island doesn't have "lakes", meaning the water inside isn't connected to the water around the island. One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100. Determine the perimeter of the island.
//
// 
//
//Example 1:
//
//
//Input: grid = [[0,1,0,0],[1,1,1,0],[0,1,0,0],[1,1,0,0]]
//Output: 16
//Explanation: The perimeter is the 16 yellow stripes in the image above.
package leed_code;

import java.util.Scanner;

public class island_perimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner san = new Scanner(System.in);
		System.out.print("Enter row size: ");
		int row = san.nextInt();
		System.out.print("Enter col size: ");
		int col = san.nextInt();
		int arr [][] = new int[row][col];
		for(int i = 0; i< row;i++) {
			for(int j = 0; j < col; j++) {
				System.out.print("Enter the valueof row"+(i+1)+" col"+(j+1)+" ");
				arr[i][j] = san.nextInt();			}
		}
		int perimeter = 0;
		
		for(int i =0; i<arr.length;i++) {
			int sqr = 4;
			for(int j = 0; j< arr[i].length;j++) {
				if(arr[i][j] == 1) {
					perimeter+=sqr;
					
					if(j!=0) {
						if(arr[i][j-1] == 1) {
							perimeter-=2;
						}
					}
					
					if(i!=0) {
						if(arr[i-1][j] == 1) {
							perimeter-=2;
						}
					}
				}
			}
		}
		System.out.println(perimeter);

	}

}
