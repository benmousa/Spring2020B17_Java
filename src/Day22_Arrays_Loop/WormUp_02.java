package Day22_Arrays_Loop;

import java.util.Arrays;

public class WormUp_02 {
    public static void main(String[] args) {

        int arr[] = { 43, 545, 54, 65, 13, 1, 5, 93, -35, 10};
        Arrays.sort(arr);

        int [] arr2 = new int [arr.length];

        int j = arr.length-1;
        for ( int i = 0; i <= arr.length-1; i ++) {
            arr2[i] = arr[j];
            j--;
        }
        System.out.println(Arrays.toString(arr2));






    }
}
