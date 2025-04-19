package javabasics;
import java.util.Scanner;

public class StudentEl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Math marks(out of 100): ");
        int math = sc.nextInt();
        System.out.print("Enter Physics marks(out of 100): ");
        int physics = sc.nextInt();
        System.out.print("Enter Chemistry marks(out of 100): ");
        int chemistry = sc.nextInt();

        int totalMarks = math + physics + chemistry;
        int mathPhysicsTotal = math + physics;

       
        if (totalMarks >= 150 && mathPhysicsTotal >= 100) {
            System.out.println("The student is eligible.");
        } else {
            System.out.println("The student is not eligible.");
        }

        sc.close();
    }
}

