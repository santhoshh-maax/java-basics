package day7;

import java.io.*;
import java.util.*;

public class vowelcount {

    public static void main(String[] args) {
        Scanner san = new Scanner(System.in);
        
        String word = san.nextLine();
        int count = 0;
        for(int i = 0; i <word.length();i++ ){
            String sub = word.substring(i, i+1);
            if(sub.equalsIgnoreCase("a") || sub.equalsIgnoreCase("e") || sub.equalsIgnoreCase("i") || sub.equalsIgnoreCase("o")|| sub.equalsIgnoreCase("u")){
                count++;
            }
            
        }System.out.println("Vowel Voyage Completed! Number of vowels: "+count);
    }
}
