package day7;

import java.io.*;
import java.util.*;

public class wordlengthmorethen {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            String s=sc.next();
            if(s.length()>10){
                String s1=s.substring(0,1);
                System.out.print(s1);
                int f=s.length();
                System.out.print(f-2);
                String s2=s.substring(f-1,f);
                System.out.println(s2);
            }else{
                System.out.println(s);
            }
        }
    }
}
