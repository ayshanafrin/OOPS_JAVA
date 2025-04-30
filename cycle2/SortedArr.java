package cycle2;
import java.util.Arrays;
import java.util.Scanner;

public class SortedArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        String[] words = new String[n];
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            words[i] = sc.nextLine();
        }

        Arrays.sort(words);


        System.out.println("Sorted Array string:");
        for (String word : words) {
            System.out.println(word);
        }

        sc.close();
    }
}
