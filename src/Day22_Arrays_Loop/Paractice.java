package Day22_Arrays_Loop;

import java.util.Arrays;

public class Paractice {
    public static void main(String[] args) {

        int[] arr = {1,62,222,34,45,6,7,8,-9,130,1221};
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
        int[] arr2 = new int [arr.length];

        int j = arr.length-1;
        for ( int i = 0; i <=arr.length-1; i++){
            arr2[i] = arr[j];
            j--;
        }
        System.out.println(Arrays.toString(arr2));
        System.out.println("<><>><><><><><><><><><><><><><><><");



        String[] str = { "Libya", "Egypt", "Tunisia", "Sudia", "Morocco"};





    }}
