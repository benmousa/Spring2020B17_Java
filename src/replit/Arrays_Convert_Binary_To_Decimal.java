package replit;

import java.util.*;

public class Arrays_Convert_Binary_To_Decimal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int[] binary = new int[8];
        for (int i = 0; i < binary.length; i++) {
            binary[i] = input.nextInt();

            int result = binary[0] + binary[1] + binary[2] + binary[3]
                       + binary[4] + binary[5] + binary[6] + binary[7];


            if ( binary[i] > 0 && binary[i] < 1){
                if ( binary[0] == 1){
                   binary [0] = 128;
                }
                if ( binary[1] == 1){
                     binary[1] = 64;
                }
                if ( binary[2] == 1){
                    binary[2] = 32;
                }
                if ( binary[3] == 1){
                    binary[3] = 16;
                }
                if ( binary[4] == 1){
                    binary[4] = 8;
                }
                if ( binary[5] == 1){
                    binary[5] = 4;
                }
                if ( binary[6] == 1){
                    binary[6] = 2;
                }
            }
            System.out.println(result);


        }
    }
}