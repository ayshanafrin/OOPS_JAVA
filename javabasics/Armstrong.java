package javabasics;
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int original = scan.nextInt();
        int temp = original; 
        int sum = 0, count = 0;

        int numCopy = original;
        while (numCopy > 0) {
            count++;
            numCopy /= 10;
        }
        while (temp > 0) {
            int lastDigit = temp % 10; // Extract last digit
            sum += Math.pow(lastDigit, count); // Raise to power & add to sum
            temp /= 10; // Remove last digit
        }

        
        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }

        scan.close();
    }
}
