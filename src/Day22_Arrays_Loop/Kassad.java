package Day22_Arrays_Loop;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Kassad {
    public static void main(String[] args) {

        int[] arr = {7, 6, 9, 8, 5, 2, 1, 4, 3};
        Arrays.sort(arr);
        int[] arr2 = new int[arr.length];

        int j = arr.length - 1;
        for (int i = 0; i <= arr.length - 1; i++) {
            arr2[i] = arr[j];
            j--;
        }
        System.out.println(Arrays.toString(arr2));

        System.out.println("><><><><><><><><><><><><><");

        String str = "I love Maisoon Mohammed loves Maisoon she loves Mohammed";

        int countMai = 0;
        int countmoMo = 0;

        String[] words = str.split(" ");

        for (String each: words) {
            if (each.contains("Maisoon")) {
                countMai++;
            }
            if (each.contains("Mohammed")) {
                countmoMo++;
            }
        }
        System.out.println(countMai == countmoMo);
        System.out.println();
    }}

