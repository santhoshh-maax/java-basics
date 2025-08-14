package day5;

import java.util.*;

public class elementcount {
    public static void main(String[] args) {
        Scanner san = new Scanner(System.in);
        
        int n = san.nextInt();
        Set<Integer> uniqueNotes = new HashSet<>();
        
        for (int i = 0; i < n; i++) {
            uniqueNotes.add(san.nextInt());
        }
        
        System.out.println(uniqueNotes.size());
    }
}