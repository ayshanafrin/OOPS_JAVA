import java.util.Scanner;

public class GradeValidator {

    // Custom exception class for invalid grade
    static class InvalidGradeException extends Exception {
        public InvalidGradeException(String message) {
            super(message);
        }
    }

    // Method to validate grade
    public static void validateGrade(char grade) throws InvalidGradeException {
        grade = Character.toUpperCase(grade); // normalize input

        // Valid grades typically: A, B, C, D, F (E is often skipped in grading systems)
        if (grade < 'A' || grade > 'F' || grade == 'E') {
            throw new InvalidGradeException("Grade must be between A and F, excluding E.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student's grade (A-F): ");
        char grade = scanner.next().charAt(0);

        try {
            validateGrade(grade);
            System.out.println("Grade is valid!");
        } catch (InvalidGradeException e) {
            System.out.println("Invalid Grade: " + e.getMessage());
        }

        scanner.close();
    }
}

