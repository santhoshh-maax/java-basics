package day6;

import java.io.*;
import java.util.*;

public class sumofeven {

    public static void main(String[] args) {
        Scanner san = new Scanner(System.in);
        
        int num = san.nextInt();
        
        int sum = 0;
        
        for(int i = 0 ; i <= num ;i++){
            if(i%2 == 0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
