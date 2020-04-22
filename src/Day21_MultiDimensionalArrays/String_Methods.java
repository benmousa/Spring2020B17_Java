package Day21_MultiDimensionalArrays;

import java.lang.reflect.Array;
import java.sql.PreparedStatement;
import java.util.Arrays;

public class String_Methods {
    public static void main(String[] args) {

        String name = "java";
        char[] ch = name.toCharArray();

        System.out.println(ch[0]);

        String name2 = "I like java";

        String[] arr = name2.split(" ");
        System.out.println(Arrays.toString(arr));

        System.out.println("><><><><><><><><><><><><><><");
        String sent = "Today is a great day";
        String [] words = sent.split(" ");
        String  last = " ";

        for ( int i = arr.length; i >= 0 ; i--){
           String eachWord =  words[i];
            last += eachWord+" ";
        }
        System.out.println(last);


    }
}
