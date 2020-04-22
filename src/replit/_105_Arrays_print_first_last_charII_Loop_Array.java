package replit;

import java.lang.reflect.Array;
import java.util.Arrays;

public class _105_Arrays_print_first_last_charII_Loop_Array {
    public static void main(String[] args) {

        String []words = {"hello", "why", "by", "apple" , "note", "mohammed"};
       // int len = words.length;
       // String [] letters = new String [len];

        String result = "";

    for ( int z = 0 ; z <= words.length-1; z++ ){
        words[z] =words[z].substring(0,1)+""+ words[z].substring(words[z].length()-1, words[z].length());
        result += words[z] +" ";
    }

   String [] letters = result.split(" ");
    System.out.println(Arrays.toString(letters));

}




    }

