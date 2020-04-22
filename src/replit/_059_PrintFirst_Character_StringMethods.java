package replit;

import java.util.Scanner;

public class _059_PrintFirst_Character_StringMethods {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String word = scan.next();

        int lenght = word.length();

        char firstChara = word.charAt(0);

        System.out.println(firstChara);
    }
}
