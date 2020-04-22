package Day11_Scanner;

import java.util.Scanner;

public class ScannerClass {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println("Enter a Long number: ");
        long a = input.nextLong();

        System.out.println("Yo have entered: "+a);

        System.out.println("Emter a decimal: ");
        double b = input.nextFloat();

        System.out.println("You have entered: "+b);


    }

}
