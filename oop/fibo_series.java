package day6;

import java.io.*;
import java.util.*;

public class fibo_series {

    public static void main(String[] args) {
        Scanner san = new Scanner(System.in);
        
        int num = san.nextInt();
        int a = 0;
        int b = 1;
        
        if(num <=1 ){
            System.out.println(num);
        }
        else{
            for(int i = 0; i< num; i++){
                System.out.print(a+" ");
                int c = a+b;
                a = b;
                b = c;
            }
        }
        
    }
}
