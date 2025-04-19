package javabasics;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a limit: ");
        int limit = scan.nextInt();
        int a = 0, b = 1;
        int c = a;

        System.out.print("Fibonacci series: ");

        while (c <= limit) {
            System.out.print(c + " "); 
            c = a + b; 
            a = b; 
            b = c;
        }

        scan.close();
    }
}
