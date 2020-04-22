package Day14_StringClass;

import java.util.Scanner;

public class checkWords {
    public static void main(String[] args) {

        Scanner data = new Scanner(System.in);

        System.out.println("Enter your first word please");
        String word1 = data.next();

        System.out.println("Enter your second word please");
        String word2 = data.next();

        System.out.println("Enter your thired word please");
        String word3 = data.next();

        int length1 = word1.length();
        int length2 = word2.length();
        int length3 = word3.length();

        if (length1 == length2 && length1 == length3){
            System.out.println("All words are same length");
        }
        else if (length1 != length2 && length1 != length3 && length2 != length3){
            System.out.println("All words are not same");
        }



    }
}
