package Day14_StringClass;

import java.util.Scanner;

public class WarmUp_02_CombineToString {

    /* Ask user to enter two words. Print first word without its first character then print the second word without its first character.
			Input:
				apple
				banana
			Output:
				ppleanana
     */
    public static void main(String[] args) {

        Scanner data = new Scanner (System.in);

        System.out.println("Enter your first word");
        String word1 = data.next();
        word1 = word1.substring(1, word1.length()-1);

        System.out.println("Enter your second word");
        String word2 = data.next();
        word2= word2.substring(1, word2.length()-1);

        String result = word1+word2;

        System.out.println(result);


       /* String a = "HelloWorld";
                 // 012345678
        a = a.substring(1,10);
        String a2 = a.substring(3,5);

        int a1 = a.length()-1;

        System.out.println(a);

        System.out.println(a1);

        System.out.println(a2);

        */

    }
}
