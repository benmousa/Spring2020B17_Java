package Day22_Arrays_Loop;

import java.util.Arrays;

public class WormUp_03 {
    public static void main(String[] args) {
        /*
        write a program that can return the number of appearances of "java" and "python" anywhere in the sentence
                (it's similar to the task 97 in repl.it, But this time you MUST use arrays and for each loop)
         */

        String sent = "I like java, javascript and paython ";
        int countJava = 0;
        int countPython = 0;

        String[] words = sent.split(" ");

        for ( String each : words){
            if ( each.contains("java")){
                countJava++;
            }
            if ( each.contains("paython")){
                countPython++;
            }
        }
        System.out.println(countJava);
        System.out.println(countPython);


    }
}