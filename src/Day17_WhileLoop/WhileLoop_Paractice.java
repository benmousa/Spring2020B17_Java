package Day17_WhileLoop;

import java.util.Scanner;

public class WhileLoop_Paractice {
    public static void main(String[] args) {

        Scanner data = new Scanner(System.in);

        System.out.println("Please enter Yes or No");
        String word = data.next();

        boolean valid = word.equalsIgnoreCase("yes") || word.equalsIgnoreCase("no");


        while (!valid) {
            System.out.println("Re-enter please");
            word = data.next();

            if (word.equalsIgnoreCase("yes") || word.equalsIgnoreCase("no")){
                break;
            }
        }
        if ( word.equalsIgnoreCase("yes")){
            System.out.println("Entered Yes");
        }
        if (word.equalsIgnoreCase("no")) {
                System.out.println("Entered No");
        }

    }
}
