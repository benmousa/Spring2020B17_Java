package Day21_MultiDimensionalArrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Multi_Dimensional_Arrays {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4};
        int [] [] arr2D = { { 1,2,3} , { 4, 5, 6, 7}};

        System.out.println(arr2D.length);

        System.out.println(Arrays.toString(arr2D[1]));

        int num = arr2D [1] [3];
        System.out.println(num);
        System.out.println("><><><><><><><><><><><><><><><><");

        char [][] ch2D = { { 'A', 'B', 'C'} , { 'D', 'E', 'F'}, { 'G', 'H', 'I'} };

        char c1 = ch2D [1] [0];
        System.out.println(c1);

        char[] ch3 = {9733, 9733, 9733, 9733, 9733, 9733, 9733, 9733, 9733, 9733, 9733, 9733, 9733, 9733, 9733, 9733, 9733 };
        System.out.println(ch3);





    }
}
