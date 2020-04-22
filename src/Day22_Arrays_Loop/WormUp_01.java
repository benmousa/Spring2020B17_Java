package Day22_Arrays_Loop;

import java.lang.reflect.Array;
import java.util.Arrays;

public class WormUp_01 {
    public static void main(String[] args) {

        /*
         write a program that can reverse the array
         */

        int [] arr = { 1,2,3,4,5,6,7,8,9};
        int [] arr2 = new int [arr.length];

        int j = arr.length-1;

        for ( int i =0; i <= arr.length-1; i ++){
            arr2[i] = arr[j];
            j--;
        }
        System.out.println(Arrays.toString(arr2));

    }
}
