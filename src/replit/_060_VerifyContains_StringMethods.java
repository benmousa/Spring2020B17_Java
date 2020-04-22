package replit;

import java.util.Scanner;

public class _060_VerifyContains_StringMethods {
    public static void main(String[] args) {

        Scanner data = new Scanner(System.in);

        System.out.println("Enter your word");
        String word = data.nextLine();

        System.out.println("Enter your sentence");
        String sentence = data.nextLine();

        boolean result = sentence.contains(word) == true || ! sentence.contains(word) == false;



         System.out.println(result);
    }
}
