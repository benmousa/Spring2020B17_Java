package Day14_StringClass;

import java.util.Scanner;

public class CombinetwoStrings {
    public static void main(String[] args) {

        Scanner data = new Scanner (System.in);

        System.out.println("Enter your first word");
        String word1 = data.next();

        System.out.println("Enter your second word");
        String word2 = data.next();

        word1 = word1.substring(1);
        word2 = word2.substring(1);

        System.out.println(word1.concat(word2));
    }
}
