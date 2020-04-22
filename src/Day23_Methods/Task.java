package Day23_Methods;

import java.util.Arrays;

public class Task {
    public static void main(String[] args) {

        int [] arr = { 1,3,6,9,4};
      //  int [] arr2 = { };

        for ( int c = 0; c <= arr.length-1; c++){
            int i = 1;
            int[] max = { -99999999,-77, };
            while ( i <= arr.length-1){
                i++;
                if (arr[c] > max[i]){
                    max[i] = arr[c];
                }
            }
            System.out.println(max[i]);

        }


    }
    public static void maxNumberArray (){


    }
}

