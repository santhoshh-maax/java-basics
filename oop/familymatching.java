package day5;

import java.io.*;
import java.util.*;

public class familymatching {

    public static void main(String[] args) {
        Scanner san = new Scanner(System.in);
        int size = san.nextInt();
        
        int arr1[] = new int[size];
        int arr2[] = new int[size];
        
        for (int i = 0; i < size; i++){
            arr1[i] = san.nextInt();
        }
        
        for (int i = 0; i < size; i++){
            arr2[i] = san.nextInt();
        }
        boolean match = true;
        for (int i = 0; i < size; i++) {
            if (arr1[i] != arr2[i]) {  
                match = false;         
                break;                 
            }
        }
      if (match) {
            System.out.println("Match Found!");
        } else {
            System.out.println("No Match Found!");
        }
            
        }
        
    }


