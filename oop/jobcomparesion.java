package day5;

import java.io.*;
import java.util.*;

public class jobcomparesion {

    public static void main(String[] args) {
       Scanner san = new Scanner(System.in);
        
        int size = san.nextInt();
        
        int bob[] = new int[size];
        int alice[]= new int [size];
        
        for(int i = 0; i<size;i++){
            bob[i] = san.nextInt();
            
        }
        for(int i = 0; i<size;i++){
            alice[i] = san.nextInt();
            
        }
        boolean comp = true;
        for(int i =0; i< size; i++){
            if(bob[i] < alice[i]){
                comp=false;
                break;
            }
            
        }
        if(comp){
            System.out.println("Compatibility Achieved!");
        }
        else{
       System.out.println("Incompatibility Detected!");   
            
        }
        
       
        
    }
}
