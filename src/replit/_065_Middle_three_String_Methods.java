package replit;

import java.util.*;

public class _065_Middle_three_String_Methods {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = scan.next();

        int lenght = word.length();
        String middleThree =" ";


        if (lenght >= 5 && lenght %2 != 0){
            middleThree += word.substring(lenght / 2 - 1, lenght / 2 + 2);
            System.out.println(middleThree.trim());
        }
        else
        {
            System.out.println("invalid");
        }





    }
}
