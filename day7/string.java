package day7;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = " santhosh__";
		String s2 = new String ("BECSE");
		String s3 =  new String("Be CSE");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2); //compare the object refernece
		System.out.println(s1.equals(s2)); //compare two strings
		System.out.println(s2.equalsIgnoreCase(s3));//igonre case
		System.out.println(s1.length()); //to find length
		System.out.println(s1.trim()); //to trim space
		System.out.println(s1.trim().length()); //check the last pos sapce ignore or not;
		
		
		String test = "testing /hi";
		String word [] = test.split(" /");
		for(String var : word) {
			System.out.println(var);
		}
		
		//s2 = BECSE
		System.out.println(s2.substring(0,2)); //substring start index,end = end - 1;
		String a1 = "Helloworld";
		System.out.println(a1.contains("world")); //check weather the world in the string..
		System.out.println(a1.endsWith("d")); //is the string ends with 
		System.out.println(a1.startsWith("h")); // is the string starts with
		System.out.println(a1.charAt(2)); //char at the specfic pos
		System.out.println(a1.concat(" this is java")); //add string with another
		System.out.println(a1.toUpperCase()); //convert to upper
		System.out.println(a1.toLowerCase()); //convert to lower
		System.out.println(a1.indexOf("o")); //check from front
		System.out.println(a1.lastIndexOf("o")); //check from back
		System.out.println(a1.replace('o','a' ));
		

	}

}
