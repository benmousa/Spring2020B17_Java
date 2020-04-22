package Day25_Methods_Recap;

import Resurses.Library;

public class Frequency_of_Characters {
    public static void main(String[] args) {

        String str = "AAAAAAABBBCCC";
        String NonDup = Library.RemoveDuplicate(str);
        String result ="";

        for ( int i = 0; i <= NonDup.length()-1; i++){
            String ch = ""+NonDup.charAt(i);
            int num = Library.Frequency(str, ch);
            result += ch+num;
            }
       // System.out.println(result);

        String word = "AAAABBBCCCD";

        String word2 = FrequencyOfChars(word);

        System.out.println(word2);
    }

    public static String FrequencyOfChars (String str){

        String NonDup = Library.RemoveDuplicate(str);
        String result ="";

        for ( int i = 0; i <= NonDup.length()-1; i++){
            String ch = ""+NonDup.charAt(i);
            int num = Library.Frequency(str, ch);
            result += ch+num;
        }
        return result;
    }
}
