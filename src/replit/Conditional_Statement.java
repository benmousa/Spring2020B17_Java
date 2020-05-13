package replit;

import java.util.ArrayList;
import java.util.Arrays;

public class Conditional_Statement {
    public static void main(String[] args) {

        /*
        Given a string variable "word", do the following tests

If the word ends in "y", print "-ies"
If the word ends in "ey", print "-eys"
If the word ends in "ife", print "-ives"
If none of the above is true, print "-s"
No more than one should be printed
         */

       // String word = "journey";
        // String word = "wife";
        // String word = "play";
        String word = "car";


        char[] ch = word.toCharArray(); //[e, d, e, y]
        char[] ch2 = new char[ch.length];

        ArrayList<Character> list = new ArrayList<>();

        if (ch[ch.length-1] == 'y'){
            for ( int i = 0; i <= ch.length-2; i++){
                ch2[i] = ch[i];
                list.add(ch2[i]);
            }
            list.add('i');
            list.add('e');
            list.add('s');

            for( int i = 0; i <= list.size()-1; i++){
                System.out.print(list.get(i)+""); //output => "-ies"
            }
        }

        else if (ch[ch.length-2] == 'e' && ch[ch.length-1] == 'y'){
            for ( int i = 0; i <= ch.length-1; i++){
                ch2[i] = ch[i];
                list.add(ch2[i]);
            }
            list.add('s');

            for( int i = 0; i <= list.size()-1; i++){
                System.out.print(list.get(i)+""); //output => "-eys"
            }
        }

        else if (ch[ch.length-3] == 'i' && ch[ch.length-2] == 'f' && ch[ch.length-1] == 'e'){
            for ( int i = 0; i <= ch.length-3; i++){
                ch2[i] = ch[i];
                list.add(ch2[i]);
            }
            list.add('v');
            list.add('e');
            list.add('s');

            for( int i = 0; i <= list.size()-1; i++){
                System.out.print(list.get(i)+""); //output => "-ives"
            }
        }

        else{
            for ( int i = 0; i <= ch.length-1; i++){
                ch2[i] = ch[i];
                list.add(ch2[i]);
            }
            list.add('s');

            for( int i = 0; i <= list.size()-1; i++){
                System.out.print(list.get(i)+""); //output => "-s"
            }
        }








    }
}
