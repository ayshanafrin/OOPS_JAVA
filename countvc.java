import java.util.Scanner;

public class countvc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a line of text: ");
        String text = scan.nextLine().toLowerCase(); 

        int vowels = 0, consonants = 0;

        // Loop through each character in the string
        for (char ch : text.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') { // Only consider letters
                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);

        scan.close();
    }
}
