package day4;

import java.io.*;
import java.util.*;

public class arraydelection {

    public static void main(String[] args) {
       Scanner san = new Scanner(System.in);
       int size = san.nextInt();
        int arr[] = new int[size];
        
        for(int i = 0; i < size; i++){
            arr[i] = san.nextInt();
            
        }
        int pos = san.nextInt();
        System.out.println("Array after deletion is");
        for(int i = 0 ; i < size; i++){
         if(i != pos - 1){
             System.out.println(arr[i]);
         }
            
        }
    }
}