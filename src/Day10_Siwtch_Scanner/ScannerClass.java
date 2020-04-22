package Day10_Siwtch_Scanner;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println("Enter a number: ");

        byte num = input.nextByte();

        System.out.println("you have entered: "+num);
    }


}
