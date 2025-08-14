package Day2;
import java.util.*;
public class Agecheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner san = new Scanner(System.in);
		System.out.print("Enter your age:");
		
		int age = san.nextInt();
		int waitingYear = 0;
		
		 
		if (age >= 18) {
			System.out.println("your age is: "+age+" \nyou are eligable for voting");
		}
		else {
			waitingYear =  18 - age; 
			System.out.println("your age is: "+age+" \nyou need to wait for: "+waitingYear+" years"+" \nyou are not eligable for voting now!...");
		}

	}

}
