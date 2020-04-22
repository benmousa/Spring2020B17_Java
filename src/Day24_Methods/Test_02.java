package Day24_Methods;
import Resurses.Library;

import java.util.Arrays;

public class Test_02 {
    public static void main(String[] args) {

        String word = "MuhtaR";
       word =  Library.Reverse(word);

        System.out.println(word);

        int [] arr = { 1,4,5,3,9,11};

        int[] num = Library.sortDescending(arr);

        System.out.println(Arrays.toString(num));

    }
}
