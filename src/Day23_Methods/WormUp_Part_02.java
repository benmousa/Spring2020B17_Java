package Day23_Methods;

import java.util.Arrays;
public class WormUp_Part_02 {
    public static void main(String[] args) {


    /*
    1.  Write a program that can print out the unique values from a String Array
			Ex:
				if arr -> {"A", "A", "B", "C", "C"}
				output: B
				if arr -> {"A", "B", "B", "C"}
				output:  A
						 C
			MUST use for each loop
     */
        String[] latters = {"A", "A", "B", "C", "C"};
        int[] arr = {1,1,2,3,3};
        String sentence = "I like Libya";
        String [] words = sentence.split(" ");

        System.out.println(Arrays.toString(words));

        String result = " ";
        for ( int i = words.length-1; i >= 0; i--){
            result += words[i] +" ";
            }
        System.out.println(result.trim());











    }}