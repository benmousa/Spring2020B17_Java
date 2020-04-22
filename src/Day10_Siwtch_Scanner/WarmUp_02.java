package Day10_Siwtch_Scanner;

public class WarmUp_02 {
    public static void main(String[] args) {
        /* write a java program that can convert numbers between 0 ~ 9 to words, if the number is greater than 9 or less than zero,
        out put should be "Invalid".
				DO NOT USE IF STATEMENTS */

        int number = 10;
        String word = (number == 0 ) ? "Zero" :(number == 1)? "One" :(number == 2)? "Two" :(number == 3)? "Three" :(number == 4)?
                    "Four" :(number == 5)? "Five" :(number == 6)? "Six" :(number == 7 )? "Seven" :(number == 8)? "Eight"
                    :(number == 9)?"Nine":"Invalid";


        System.out.println(word);
    }
}
