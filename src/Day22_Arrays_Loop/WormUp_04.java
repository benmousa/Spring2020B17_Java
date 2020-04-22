package Day22_Arrays_Loop;

import java.util.Arrays;

public class WormUp_04 {
    public static void main(String[] args) {

        /*
        write a program that can count the even and odd number from an array of integers
                        MUST use for each loop
         */
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11};

        int arrOdd = 0;
        int arrEven = 0;

        for (int each : arr ){
            if ( each %2 !=0 ){
                arrOdd++;
            }
            else{
                arrEven++;
            }
        }
        System.out.println("Odd numbers: "+arrOdd);
        System.out.println("Even numbers: "+arrEven);


    }
}
