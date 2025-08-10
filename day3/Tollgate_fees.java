package day3;

import java.io.*;
import java.util.*;

public class Tollgate_fees {

    public static void main(String[] args) {
        Scanner san = new Scanner(System.in);
        System.out.print("enter solo trips count: ");
        int solotravel = san.nextInt();
        System.out.print("enter roundtrip trips count: ");
        int returnonsameday = san.nextInt();
        System.out.print("enter solo pass amount: ");
        float solo = san.nextFloat();
        System.out.print("enter roundtrip pass count: ");
        float round = san.nextFloat();
        System.out.print("enter monthly pass amount: ");
        float monthly = san.nextFloat();
        
        float calsolo = solotravel*solo;
        float calround = returnonsameday*round;
        float total = calsolo + calround;
        
        
        if (solo > round || 2*solo < round){
            System.out.println("Invalid Input");
            
        }
        else if(total < monthly){
            System.out.println("Solo Trail + Roundabout Ride");
        }
        else{
            System.out.println("Monthly Pass");
            
        }
    }
}