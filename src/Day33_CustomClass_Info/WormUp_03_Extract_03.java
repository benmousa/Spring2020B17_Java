package Day33_CustomClass_Info;

import java.util.ArrayList;

public class WormUp_03_Extract_03 {
    public static void main(String[] args) {

        String str = "ABCD123$%#@&456EFG!";
        System.out.println(str);


        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Character> digits = new ArrayList<>();
        ArrayList<Character> specialChar = new ArrayList<>();

        for (int i =0; i <= str.length()-1; i++){
            char ch = str.charAt(i);
            if (Character.isLetter(ch) ){
                letters.add(ch);
            }
            else if ( Character.isDigit(ch)){
                digits.add(ch);
            }
            else {
                specialChar.add(ch);
            }
        }
        System.out.println(letters);
        System.out.println(digits);
        System.out.println(specialChar);

    }
}
