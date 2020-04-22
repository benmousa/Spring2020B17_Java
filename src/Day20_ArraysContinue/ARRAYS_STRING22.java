package Day20_ArraysContinue;

import java.util.Arrays;

public class ARRAYS_STRING22 {
    public static void main(String[] args) {

        int[] arr = {3,1,4,-1,100, -100, 200, 155};
        int [] arr2 = new int [arr.length];
        Arrays.sort(arr);

        int j = 0;
        for ( int i = arr.length-1; i >= 0; i--){
            arr2[j] = arr[i];
            j++;
        }
        System.out.println(Arrays.toString(arr2));


    }
}
