package day1;
import java.util.Scanner;
public class Task {
    public static void mian(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("enter a num:");
        int answer = (num % 10) + (num / 10);
        System.out.println(answer);

    }
    
}
