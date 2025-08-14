package day3;


import java.io.*;
import java.util.*;

public class Space_seatbelt {

    public static void main(String[] args) {
        Scanner san = new Scanner(System.in);
        String str1 = san.nextLine();
        String str2 = san.nextLine();
        String str3 = san.nextLine();
        
        if(str1.equals("engaged") && str2.equals("engaged") && str3.equals("engaged")){
            System.out.println("Initiating Warp Drive!");
        }
        else if (str1.equals("engaged") || str2.equals("engaged")  || str3.equals("engaged")){
            System.out.println("Hold On! Some Belts are Adrift.");
            }
        
        
        else{
            System.out.println("Invalid Input");
        }
        
    }
}