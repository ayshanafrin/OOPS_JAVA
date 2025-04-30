package cycle2;
import java.util.Scanner;

public class Symmetry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of matrix: ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        // Input matrix elements
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();

        // Check symmetry
        boolean symmetric = true;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) { // Check only upper triangle
                if (matrix[i][j] != matrix[j][i]) {
                    symmetric = false;
                    break;
                }
            }
            if (!symmetric) break; // Exit early if found not symmetric
        }

        // Display result
        System.out.println(symmetric ? "The matrix is symmetric." : "The matrix is not symmetric.");

        sc.close();
    }
}
