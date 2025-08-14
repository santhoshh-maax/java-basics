package Day2;

import java.util.Scanner;

public class Ternery_operator {

	public static void main(String[] args) {
		Scanner san = new Scanner(System.in);
		System.out.print("Enter a Postive Number: ");
		int num = san.nextInt();
		String ans = (num%2 == 0)?"The Number "+num+" is Even":"The Number " +num+" is Odd";
		System.out.println(ans);

	}

}
