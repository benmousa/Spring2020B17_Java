package replit;

import java.util.Scanner;

public class _035_ {

    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
        System.out.println("Enter your first word please");
            String word1 = s.next();

        System.out.println("Enter your second word please");
            String word2 = s.next();

            if (word1.equals(word2)){
                System.out.println("word1 equlas to word2");
            }
            else{
                System.out.println("word1 does not equal to word2");
            }

}}
