package javabasics;
import java.util.Scanner;

public class Paliandrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int original = sc.nextInt();
        int temp = original; 

        int reverse = 0;
        while (temp > 0) {
            int lastDigit = temp % 10;          // Extract last digit
            reverse = reverse * 10 + lastDigit; // Build reversed number
            temp /= 10;                         // Remove last digit
        }

        
        if (original == reverse) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }

        sc.close();
    }
}
