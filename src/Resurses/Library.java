package Resurses;

import java.util.Arrays;

public class Library {

    public static int [] sortDescending (int[] arr) {
        Arrays.sort(arr);
        int[] RevArr = new int[arr.length];

        int j = arr.length - 1;
        for (int i = 0; i <= arr.length - 1; i++) {
            RevArr[i] = arr[j];
            j--;
        }

        return RevArr;

    }

    public static String Reverse (String str){

        String reverse ="";

        for ( int i = str.length()-1; i >= 0; i --){
            reverse += str.charAt(i);
        }
        return  reverse;
    }

    public static String RemoveDuplicate(String word ){

        String result = "";

        for ( int i =  0; i <= word.length()-1; i++){
            if ( ! result.contains(""+word.charAt(i))){
                result += word.charAt(i);
            }
        }
        return result;
    }

    public static int Frequency (String str1, String str2){
        int count = 0;

        while ( str1.contains(str2)){
            count ++;
            str1 = str1.replaceFirst(str2, "");
        }
        return count;
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
