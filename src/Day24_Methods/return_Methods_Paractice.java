package Day24_Methods;

import java.util.Arrays;

public class return_Methods_Paractice {


    public static int MaxNumber (int[] array){

        Arrays.sort(array);
        return array[array.length-1];
    }
    public static int minNumber (int[] array){
        Arrays.sort(array);

        return array[0];
    }

    public static void main(String[] args) {
        int [] arr = {434,45,5343,232,1,23};
        int  max = MaxNumber(arr);
        System.out.println(max);

        int min = minNumber(arr);
        System.out.println(min);
    }
}
