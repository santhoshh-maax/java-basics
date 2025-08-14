package day6;

import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class bigInteger {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int n = sc.nextInt();
        int z = 0;
        
        BigInteger c = BigInteger.ONE;

        while (n > 1) {
            c = c.multiply(BigInteger.valueOf(n));
            n--;
        }
        while (c.mod(BigInteger.TEN).equals(BigInteger.ZERO)) {
            z++;
            c = c.divide(BigInteger.TEN);
        }

        System.out.println(z);
    }
}