package day3;

import java.io.*;
import java.util.*;

public class Meeting {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner san =  new Scanner(System.in);
        int dis =  san.nextInt(); //100
        int speed =  san.nextInt(); //25
        float conf = san.nextFloat(); //16.00
        float cur = san.nextFloat(); //10.00
        
        int time = dis/speed; // 100/25 = 4
        float totaltime = time + cur; //10+4 = 14 so 2.pm
        
        if(conf > cur)// 16 > 10 true 
        {
            if(conf >= totaltime) // 16  > 14
            {
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
            
        }
        else{
            System.out.println("Invalid Input");
        }
        
        
    }
}