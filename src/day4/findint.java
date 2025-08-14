package day4;

import java.io.*;
import java.util.*;

public class findint {

    public static void main(String[] args) {
        Scanner san = new Scanner(System.in);
        int size = san.nextInt();
        
        int arr[] = new int[size];
        
        for(int i =0; i< size; i++){
            arr[i] = san.nextInt();
        }
        
        int exclusive = san.nextInt();
        boolean found = false;
        
        for(int Artifact : arr ){
            if (Artifact ==  exclusive ){
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("Elusive Artifact Found!");
        }
        else{
            System.out.println("Elusive Artifact Not Found!");
        }
    }
}
