package day7;

import java.io.*;
import java.util.*;

public class wordcount {

    public static void main(String[] args) {
       Scanner san = new Scanner(System.in);
        
        String word = san.nextLine();
        
        int len = word.length();
        
        System.out.println("Quantum revelation! The quantum length of "+word+" is "+len+".");
    }
}
