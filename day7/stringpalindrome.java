package day7;

import java.io.*;
import java.util.*;

public class stringpalindrome {

    public static void main(String[] args) {
        Scanner san = new Scanner(System.in);
        String var1 = san.nextLine();
        StringBuffer buffer = new StringBuffer(var1);
        buffer.reverse();
        String reverse = buffer.toString();
        if(reverse.equals(var1)){
            System.out.println("Palindrome Revelation! The string is a palindrome.");
        }
        else{
            System.out.println("Palindromic Mystery Unsolved! The string is not a palindrome.");
        }
        
        
    }
}