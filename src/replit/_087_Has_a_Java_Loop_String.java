package replit;

import java.util.Scanner;

public class _087_Has_a_Java_Loop_String {
    public static void main(String[] args) {

        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
               word.equalsIgnoreCase(word);

        if( word.substring(0,1).equals("j") && word.substring(1,2).equals("a") && word.substring(2,3).equals("v")
                && word.substring(3,4).equals("a") || word.substring(1,2).equals("j") && word.substring(2,3).equals("a")
                && word.substring(3,4).equals("v") && word.substring(4,5).equals("a") ){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
