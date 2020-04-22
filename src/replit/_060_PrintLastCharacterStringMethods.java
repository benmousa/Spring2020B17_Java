package replit;

import java.util.Scanner;

public class _060_PrintLastCharacterStringMethods {
    public static void main(String[] args) {

        Scanner data = new Scanner (System.in);

        System.out.println("Enter your word");
        String str = data.next();

        int length = str.length();

        char lastChara = str.charAt(length-1);

        System.out.println(lastChara);
    }
}
