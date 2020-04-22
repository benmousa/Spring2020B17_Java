package replit;

import java.util.Scanner;

public class _23_PhoneNumber {

    public static void main(String[] args) {

        Scanner data = new Scanner (System.in);

        System.out.println("Enter your area code here please");
        int areaCode = data.nextInt();

        System.out.println("Enter 7 digits of your phone number here please");
        int localNumber = data.nextInt();

        System.out.println("Calling number ("+areaCode+")-"+localNumber);





    }

}
