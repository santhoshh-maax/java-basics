package day2;

import java.io.*;
import java.util.*;

public class Colors {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner san =  new Scanner(System.in);
        String w = san.nextLine();
        if(w == "RED"){
            System.out.println("The Chromatic Horizon reveals: It is Dusk");
        }
        else if(w == "BLUE"){
            System.out.println("The Chromatic Horizon whispers: It is Dawn");
        }
        else{
            System.out.println("The Chromatic Riddle unfolds: Invalid Input");
        }
    }
}
