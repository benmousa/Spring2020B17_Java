package replit;

import java.util.Arrays;

public class  _103_Arrays_Reverse_Sentence2_Loop_Array {
    public static void main(String[] args) {

        String sentence = "Java is fun";
        String reversed = " ";

        String [] result = sentence.split(" ");

        int j = 0;
        for ( int i = result.length-1; i >= 0 ; i--){
            reversed += result[i]+ " ";
            j--;
        }
        System.out.println(reversed.trim());

       // System.out.println(Arrays.toString(reversed));

    }
}
