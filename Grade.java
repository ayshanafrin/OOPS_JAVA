import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.print("Enter your percentage: ");
        double percentage = sc.nextDouble();

        String grade;
        String feedback;
        if (percentage >= 90) {
            grade = "A";
            feedback = "Excellent work!";
        } else if (percentage >= 80) {
            grade = "B";
            feedback = "Good job!";
        } else if (percentage >= 70) {
            grade = "C";
            feedback = "You can do better.";
        } else if (percentage >= 60) {
            grade = "D";
            feedback = "Work harder.";
        } else {
            grade = "F";
            feedback = "Failed. Try again.";
        }

        System.out.println("\nYour Grade: " + grade);
        System.out.println("Feedback: " + feedback);

        sc.close(); 
    }
}

