package Day10_Siwtch_Scanner;

import java.util.Scanner;

public class ScannerClass_Paractice {
    public static void main(String[] args) {

        Scanner acara = new Scanner(System.in);

        System.out.println("Enter your first number here: ");
                byte number = acara.nextByte();

        System.out.println("Enter your second number here: ");
                 byte number2 = acara.nextByte();

                 int total = (number + number2);

        System.out.println("the sum of "+number+" and "+number2+" are: "+total);

    }
}
