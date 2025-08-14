package day4;

import java.io.*;
import java.util.*;

public class sumofarrays {

    public static void main(String[] args) {
        Scanner san = new Scanner(System.in);
        int size = san.nextInt();
        int arr1[] = new int[size];
        int arr2[] = new int[size];
        int sum[] = new int[size];
        
        for (int i =0 ; i < size; i++){
                arr1[i] = san.nextInt();}
        
            for(int i = 0; i < size; i++){
                arr2[i] = san.nextInt();
            }
            
        for (int i = 0; i < size; i++){
                sum[i] = arr1[i] + arr2[i];
            
            }
        for (int i = 0 ; i < size; i++){
            System.out.print(sum[i] + " ");
        }
        
        
        
        
    }
}