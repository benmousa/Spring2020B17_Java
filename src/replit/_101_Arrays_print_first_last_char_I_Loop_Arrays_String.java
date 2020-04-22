package replit;

import java.lang.reflect.Array;
import java.util.Scanner;

public class _101_Arrays_print_first_last_char_I_Loop_Arrays_String {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Names");
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        words[0] = words[0].substring(0,1) + words[0].substring(words[0].length()-1,words[0].length()) ;
        words[1] = words[1].substring(0,1) + words[1].substring(words[1].length()-1,words[1].length()) ;
        words[2] = words[2].substring(0,1) + words[2].substring(words[2].length()-1,words[2].length()) ;
        words[3] = words[3].substring(0,1) + words[3].substring(words[3].length()-1,words[3].length()) ;
        words[4] = words[4].substring(0,1) + words[4].substring(words[4].length()-1,words[4].length()) ;

        System.out.println(words[0]);
        System.out.println(words[1]);
        System.out.println(words[2]);
        System.out.println(words[3]);
        System.out.println(words[4]);



    }
}
