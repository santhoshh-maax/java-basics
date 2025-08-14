
package day5;



import java.io.*;
import java.util.*;

public class maxarray {

    public static void main(String[] args) {
        Scanner san = new Scanner(System.in);
        int size = san.nextInt();
        
        int arr[] = new int[size];
        
        for(int i =0; i < size; i++){
            arr[i] = san.nextInt();
            }
        
        int even = 0;
        int odd = 0;
        
        for(int i =0 ; i < arr.length; i++){
            if(arr[i]%2 == 0){
                even +=arr[i];
            }
                else{
                    odd+= arr[i];
            }
            
        }
         System.out.println("Victory in the Number Quest Duel!");   
         System.out.println("Sum of even numbers: "+even+".");
         System.out.println("Sum of odd numbers: "+odd+".");
    }
}
