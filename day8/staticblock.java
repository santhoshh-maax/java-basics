package day8;

public class staticblock {
	static {
		System.out.print("santhosh"); //first it will run static block because memeory is created when main block execute
	}

	public static void main(String[] args) { //when program run first mianblock will allocate memory for static.
		
		System.out.println(" nice to meeet you bro");

	}

}
