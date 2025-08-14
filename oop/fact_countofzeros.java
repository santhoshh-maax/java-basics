package day6;

import java.io.*;
import java.util.*;

public class fact_countofzeros{

    public static void main(String[] args) {
   Scanner san = new Scanner(System.in);
        int num = san.nextInt();
        long fact = 1;
        long total = 0;
        for(int i = 1; i <= num; i++){
            fact*=i;
        }
        while(fact > 0){
            long temp = (long)fact%10;
            total = total + temp;
            fact = fact / 10;
        }
        System.out.println(total);
    }
}