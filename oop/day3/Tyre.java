package day3;

import java.io.*;
import java.util.*;

public class Tyre {

    public static void main(String[] args) {
        Scanner san = new Scanner(System.in);
        
        float frontleft = san.nextFloat();
        float rearleft = san.nextFloat();
        float rearright = san.nextFloat();
        float frontright = san.nextFloat();
        
        if(frontleft < 33 ){
            System.out.println("Front-left : Inflate");
        }
        else if(frontleft > 33){
            System.out.println("Front-left : Deflate");
            }
        else if(frontleft == 33){
            System.out.println("Front-left : Untouched");
            }
        if(rearleft < 33 ){
            System.out.println("Rear-left : Inflate");
        }
        else if(rearleft > 33){
            System.out.println("Rear-left : Deflate");
            }
        else if(rearleft == 33){
            System.out.println("Rear-left : Untouched");
            }
        if(rearright < 33 ){
            System.out.println("Rear-right : Inflate");
        }
        else if(rearright > 33){
            System.out.println("Rear-right : Deflate");
            }
        else if(rearright == 33){
            System.out.println("Rear-right : Untouched");
            }
        if(frontright < 33 ){
            System.out.println("Front-right : Inflate");
        }
        else if(frontright > 33){
            System.out.println("Front-right : Deflate");
            }
        else if(frontright == 33){
            System.out.println("Front-right : Untouched");
            }
        
        
        
       
        
        
        
    }
}
