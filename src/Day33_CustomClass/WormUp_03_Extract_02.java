package Day33_CustomClass;

import java.util.ArrayList;

public class WormUp_03_Extract_02 {
    public static void main(String[] args) {
        String str = "ABCD123$%#@&456EFG!";
        System.out.println(str);


        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Character> digits = new ArrayList<>();
        ArrayList<Character> specialChar = new ArrayList<>();


        char[] ch = str.toCharArray();

        for ( char each : ch){
            if (Character.isLetter(each) ){
                letters.add(each);
            }
            else if ( Character.isDigit(each)){
                digits.add(each);
            }
            else {
                specialChar.add(each);
            }
        }
        System.out.println(letters);
        System.out.println(digits);
        System.out.println(specialChar);

    }
}
