package day1;
public class TernoryOperator {
    public static void main (String args[]){
        int a = 8;
        int b = 9;
        System.out.println(a++ + b++);
        System.out.println(--b + a++);
        System.out.println(a-- + b++);
        System.out.println(--b + ++a);
        System.out.println(b);
        System.out.println(a--);
        System.out.println(--b + a);
        
    }
}
