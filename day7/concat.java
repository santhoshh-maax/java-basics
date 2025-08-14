package day7;

import java.io.*;
import java.util.*;

public class concat {

    public static void main(String[] args) {
        Scanner san = new Scanner(System.in);
        
        String s = san.nextLine();
        System.out.print("Case Cascade Magic Unleashed! The ");
        for(int i =0; i<s.length();i++){
            String sub = s.substring(i,i+1);
            boolean isupper = sub.equals(sub.toUpperCase());
            if(isupper){
                System.out.print(sub.toLowerCase());
            }
            else{
                System.out.print(sub.toUpperCase());
            }
            
        }
        System.out.print(" transformation is complete.");
    }
}