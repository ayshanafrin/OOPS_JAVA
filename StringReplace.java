import java.util.Scanner;

public class StringReplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String text = sc.nextLine();

        System.out.print("Enter the pattern to search: ");
        String pattern = sc.nextLine();

        System.out.print("Enter the replacement string: ");
        String replacement = sc.nextLine();

        String newText = text.replace(pattern, replacement);

        System.out.println("\nOld String: " + text);
        System.out.println("New String: " + newText);

        sc.close();
    }
}

