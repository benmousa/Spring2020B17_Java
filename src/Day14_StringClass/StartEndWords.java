package Day14_StringClass;

import java.util.Scanner;

public class StartEndWords {
    public static void main(String[] args) {

        /*
    2. Write a program StartEndWords:
    you have 2 words that must be 5 characters, and check if last letter of first word and
    first letter of second work are same.
        if either one not 5 chars length:    print "need to be exactly 5 chars length"
        if last letter of 1st word and first letter of 2nd word match:  print "Fizz"
        if they do not match:  print "Buzz - did not match"
        pre condition: both words MUST have exact 5 characters
     */
        Scanner data = new Scanner (System.in);

        System.out.println("Enter your first word of 5 character please");
        String firstWord = data.next();

        System.out.println("Enter your second word of 5 character please");
        String secondWord = data.next();

        String chr = " ";
        boolean check = firstWord.length() == 5 && secondWord.length() == 5;

        if (check) {
            if (firstWord.charAt(firstWord.length()-1) == secondWord.charAt(0)){
                System.out.println("Fizz");
        }
            else{
                System.out.println("Buzz - did not match");
            }
        }
        else{
            System.out.println("need to be exactly 5 chars length");
        }



    }
}
