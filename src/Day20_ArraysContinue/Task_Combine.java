package Day20_ArraysContinue;

import java.util.Arrays;

public class Task_Combine {
    public static void main(String[] args) {

        int[] arr1 = {8,2,3};
        int[] arr2 = {9,5,6,7};

        int [] arr3 = new int [arr1.length + arr2.length];


        for ( int i = 0; i <= arr1.length-1; i++) {
            arr3[i] = arr1[i];
        }

        for ( int j = 0; j <= arr2.length-1; j++){
            arr3[arr1.length+j] = arr2[j];

            }
        System.out.println(Arrays.toString(arr3));


    }
}
