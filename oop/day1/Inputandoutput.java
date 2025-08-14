package day1;

import java.util.Scanner;

public class Inputandoutput {

    public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number please:");
    int number = sc.nextInt();
    System.out.println("This is the number you entered "+ number);

    System.out.println("Enter the name please:");
    String name = sc.next();
    System.out.println("this is the name you enter " +name);
    
    System.out.println("Enter the address please:");
    sc.next();
    String address = sc.nextLine();
    System.out.println("This is the adress you entered " + address);
    System.out.println("Enter the char: ");
    char ch = sc.next().charAt(1);
    System.out.println("this is the char at pos[1]: "+ ch);
}
}

