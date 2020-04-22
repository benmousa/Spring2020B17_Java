package replit;

import java.util.Scanner;

public class _067_Reverse_it_StringMethods {
    public static void main(String[] args) {

        Scanner data = new Scanner (System.in);

        System.out.println("Enter your word");
        String word = data.next();

        String word2 = "";
        int lenght = word.length();

        if ( lenght == 5 ){
            word2 = ""+word.charAt(4) + ""+ word.charAt(3)+""+ word.charAt(2)+""+word.charAt(1)+""+word.charAt(0);
        }
        else if ( lenght > 5 ){
           word2 = "Too Long !";
        }
        else if ( lenght < 5 ){
            word2 = "Too Short !";
        }
        System.out.println(word2);

    }
}
