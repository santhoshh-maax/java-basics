package day3;


import java.io.*;
import java.util.*;

public class Almost_lucky {

    public static void main(String[] args) {
       Scanner san = new Scanner(System.in);
       System.out.print("Enter number: ");
       int n = san.nextInt();
       String s = Integer.toString(n);
        boolean a = false; boolean b = false;
        for(int i =0; i < s.length(); i++){
            if(s.charAt(i) == '4'){
                a = true;
            }
            if(s.charAt(i) == '7'){
                b = true;
            }
        }
        if(a == true && b == true){
            System.out.println("YES");
            
            
        }
        else{
            System.out.println("NO");
        }
        
    }
}