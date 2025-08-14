package day6;

import java.io.*;
import java.util.*;

public class library_paging {

    public static void main(String[] args) {
       Scanner san = new Scanner(System.in);
        
        int digit = san.nextInt();
         digit -=9;
        int page = 9;
        if(digit % 2 == 0){
            while(digit > 0){
                page++;
                digit-=2;
            }
            System.out.println(page);
            
        }
        else{
            System.out.println("Impossible!");
        }
        
        
        
              
          }
        }