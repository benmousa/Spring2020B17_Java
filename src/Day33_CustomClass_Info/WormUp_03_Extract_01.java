package Day33_CustomClass_Info;

import java.util.ArrayList;

public class WormUp_03_Extract_01 {
    public static void main(String[] args) {

         /*
    3. write a program that can extract the sepecial characters, digits and letters from a string and stores them into seperate ArrayLists of Character:
            ex:
                str = "ABCD123$%#@&456EFG!";
                list1: {$, %, #, @, &, !}
                list2: {A, B, C, D, E, F, G}
                list3: {1, 2, 3, 4, 5, 6}
        DO NOT USE LAMBDA
     */

               String str = "ABCD123$%#@&456EFG!";
        System.out.println(str);



        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Character> digits = new ArrayList<>();
        ArrayList<Character> specialChar = new ArrayList<>();


        char[] ch = str.toCharArray();

        for ( char each : ch){
            if (each >= 65 && each <= 90 ){
                letters.add(each);
            }
            else if (  each >= 48 && each <= 57){
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
