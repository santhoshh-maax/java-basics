package day4;

import java.io.*;
import java.util.*;

public class mean {

    public static void main(String[] args) {
        Scanner san = new Scanner(System.in);
        
        int size = san.nextInt();
        
        int arr[] = new int[size];
        for (int i =0; i< size; i++){
            arr[i] = san.nextInt();
            
        }
        
        double sum = 0;
        double result = 0;
        
        for(int i = 0; i< arr.length; i++){
            sum += arr[i];
            
        }
        result = sum / size;
        System.out.println("Quantum Mean Calculation Completed:");
        System.out.printf("The quantum mean of the array is %.2f\n",result);
        System.out.println("Congratulations, Quantum Explorer!");
    }
}