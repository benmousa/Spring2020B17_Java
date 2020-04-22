package Day26_Method_Overloading;

import java.util.Arrays;

public class tr {
    public static void main(String[] args) {


        int[] arr = {85, 5, 35, 65, 75, 25, 95, 15, 55, 45};

        Arrays.sort(arr);

        int[] des = new int[arr.length];

            int j = 0;
            for (int i = arr.length-1; i >= 0; i--){
                des[j] = arr[i];
                j++;
            }

        System.out.println(Arrays.toString(des));
    }
}
