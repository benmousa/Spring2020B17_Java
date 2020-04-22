package Day14_StringClass;

import java.util.Scanner;

public class WarmUp_01 {

    public static void main(String[] args) {

        /* Ask user to enter two words. Print the first word, second word, second word, first word
			Input:
				one
				two
			Output:
				onetwotwoone
					DO NOT USE + OPERATOR
         */

        Scanner data = new Scanner(System.in);

        System.out.println("Please enter your first word");
        String word1 = data.next();

        System.out.println("Please enter your second word");
        String word2 = data.next();


        String result = word1.concat(" "+word2).concat(" "+word2.concat(" " +word1));

        System.out.println(result);



    }



}
