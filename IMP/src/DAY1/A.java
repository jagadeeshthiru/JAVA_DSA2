package DAY1;
import java.util.Scanner;

public class A {


    // Method to generate permutations
    public static void permute(String str, String result) {
        if (str.length() == 0) {
            System.out.println(result);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            // Fix one character and permute the rest
            char fixedChar = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i + 1);
            permute(remaining, result + fixedChar);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println("Permutations of the string are:");
        permute(input, "");
        scanner.close();
    }
}


