package Day29_Wrapper_ArrayList;

import javafx.util.converter.NumberStringConverter;

import java.util.Arrays;

public class WrapperClass_Practice {
    public static void main(String[] args) {
        /*
        String [] arr = {"1", "2.5", "3", "3.5", "4.5"};
           find Maximum and Minimum Numbers
                Note: Do not use Sort method !!
         */
        String [] arr = {"1", "2.5", "3", "3.5", "4.5"};

        //double [] arr = {1, 2.5, 3, 3.5, 6.5};

        double maxNum = Double.MIN_VALUE;

           for ( String each : arr){
               double num = Double.parseDouble(each);
               if ( maxNum < num){
                   maxNum = num;
               }
           }
        System.out.println(maxNum);

        System.out.println("><><><><><><><><><><><><><");

        String [] array = {"1", "2.5", "3", "3.5", "4.5"};

        double[] array2 = new double[array.length];

        for ( int i = 0; i <= array.length-1; i++){
            array2[i] = Double.parseDouble(array[i]);
        }
        System.out.println(Arrays.toString(array2));








    }
}
