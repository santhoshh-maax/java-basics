package day5;

import java.io.*;
import java.util.*;

public class Solutionsumofevenno {

    public static void main(String[] args) {
        Scanner san = new Scanner (System.in);
        int size = san.nextInt();
        
        int arr[] = new int[size];
        
        for(int i =0; i< size; i++){
            arr[i] = san.nextInt();
            
        }
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] %2 == 0){
                sum+= arr[i];
            }
        }
        if(sum > 0){
          System.out.println("Pappu, the Diary Milk is yours! The sum of even numbers in the array is "+sum+".");   
        }
        else{
            System.out.println("Sorry Pappu, no Diary Milk this time. There are no even numbers in the array.");
        }
       
    }
}