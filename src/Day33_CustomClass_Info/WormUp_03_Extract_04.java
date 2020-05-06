package Day33_CustomClass_Info;

import java.util.ArrayList;
import java.util.Arrays;

public class WormUp_03_Extract_04 {
    public static void main(String[] args) {

        String str = "ABCD123$%#@&456EFG!";
        System.out.println(str);

        char[] ch = str.toCharArray();
        Character[] ch2 = new Character[ch.length];

        for ( int i = 0; i <= ch.length-1; i++){
             ch2[i] = ch[i];
        }
        System.out.println(Arrays.toString(ch2));
        System.out.println();
        ArrayList<Character> letters = new ArrayList<>(Arrays.asList(ch2));
        System.out.println(letters);
        letters.removeIf(p -> ! Character.isLetter(p));
        System.out.println(letters);

        ArrayList<Character> digits = new ArrayList<>(Arrays.asList(ch2));
        digits.removeIf(p -> ! Character.isDigit(p));
        System.out.println(digits);

        ArrayList<Character> specialChar = new ArrayList<>(Arrays.asList(ch2));
        specialChar.removeIf(p -> Character.isLetter(p) || Character.isDigit(p));
        //specialChar.removeAll(letters);
        //specialChar.removeAll(digits);
        System.out.println(specialChar);



    }
}
