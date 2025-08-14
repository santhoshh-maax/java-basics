package day6;

import java.io.*;
import java.util.*;

public class gcdof2 {

    public static void main(String[] args) {
        Scanner san = new Scanner(System.in);
        System.out.print("enter Alaric magical number: ");
        int x = san.nextInt();
        System.out.print("enter Seraphina magical number: ");
        int y = san.nextInt();
        System.out.print("enter total magical number: ");
        int n = san.nextInt();
        int min1 = x < n? x:n;
        int min2 = y < n? x:n;
        
        int gcd1 = 0;
        int gcd2 = 0;
        
        for(int i = min1; i > 0; i--){
            if(x % i == 0 && n % i == 0){
                gcd1 = i;
                break;
                } 
        }
        for (int i =min2; i > 0; i--){
            if(y % i == 0 && n % i == 0){
                gcd2 = i;
                break;
            }
        }
        
        if(gcd1 == gcd2 || gcd1 > gcd2){
            System.out.println("Alaric unravels the most Mystical Scrolls in the Grand Library!");
        }
        else{
            System.out.println("Seraphina unravels the most Mystical Scrolls in the Grand Library!");
        }
        
    }
}