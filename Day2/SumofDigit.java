package Day2;

import java.util.Scanner;

 
public class SumofDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sa = new Scanner(System.in);
		System.out.print("Enter the digit: ");
		int num = sa.nextInt();
		//int b = (num%10) + (num/10);
		System.out.println("Sum of two numbers is : "+((num%10) + (num / 10)));
		}

}
