package replit;

import java.util.Scanner;

public class _075_Without_X_x_StringMethods {
    public static void main(String[] args) {
/*Given a string word, if the first or last chars are 'x' or 'X', print the string without those 'x' or 'X' chars,
otherwise print the string unchanged.
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your word");
        String word = scan.next();
        String word2 = " ";

        int lenght = word.length()-1;
        char rep2 = word.charAt(lenght);

        if (word.startsWith("x") ||word.startsWith("X") ){
           word =  word.replaceFirst("x"," ");
           word =  word.replaceFirst("X"," ");
        }
     //   else if (word.startsWith("X")){
          //  word =  word.replaceFirst("X"," ");
     //   }
        else if (word.endsWith("x") || word.endsWith("X")) {
            word = word.replace("x", " ");
            word =  word.replace("X"," ");
        }
        else if ( word.startsWith("x") ||word.startsWith("X") && word.endsWith("x") || word.endsWith("X") ){
            word =  word.replaceFirst("x"," ");
            word =  word.replaceFirst("X"," ");
            word = word.replace("x", " ");
            String word3 =  word.replace("X"," ");

        }
       // else if (word.endsWith("X")){
        //    word =  word.replace("X"," ");

       // }
        System.out.println(word);
    //    System.out.println(lenght);
       // System.out.println(rep2);
    }
}
