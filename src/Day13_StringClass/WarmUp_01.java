package Day13_StringClass;

import java.util.Scanner;

public class WarmUp_01 {
    public static void main(String[] args) {

        /* write a java program that can convert any given numbers between 0 ~ 9 to words,
        if the number is greater than 9 or less than zero, out put should be "Invalid".
         */

        Scanner data = new Scanner (System.in);
        System.out.println("Enter your number here please ");
        int num = data.nextInt();

        String word = (num == 0 )? "Zero" :(num == 1)? "One" :(num == 2)? "Two" :(num == 3)? "Three" :(num == 4)? "Four"
                :(num == 5)? "Five" :(num == 6)? "Six" :(num == 7)? "Seven" :(num == 8)? "Eight" :(num == 9)? "Nine"
                : "Invalid";

        System.out.println(word);


    }

    }


