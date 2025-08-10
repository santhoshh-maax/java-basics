package day1;

import java.util.Scanner;



class Numbers{
     public static void main(String args[]){
        String name = "santhosh";
        long num = 9342437215L;
        System.out.println("this is "+name+"'s phone number:📱"+num);
        System.out.println("----------------------------------------------");
        float num1 = 4.6f;
        int num2 = (int)num1; //execplit
        System.out.println("the given number converted flaot: "+num1+" to int: "+num2);
         System.out.println("----------------------------------------------");
         int num3 = 5;
         float num4 = num3;
         System.out.println("given number converted from int: " +num3+" to float: "+num4);
        char ch ='a'; //97
        char ch1 = 'b'; //98
        System.out.println("----------------------------------------------");
        System.out.println("The ASCII value for the following characters "+ ch +" + "+ ch1 + " = " + (ch+ch1));
     
}
}