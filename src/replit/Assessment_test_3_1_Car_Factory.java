package replit;

import java.util.*;

public class Assessment_test_3_1_Car_Factory {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter car model");
        String model = scan.next();

        System.out.println("Enter car year");
        int year = scan.nextInt();

        boolean recalled = false;

        if ( year >= 2010 && year <= 2012 && model.equalsIgnoreCase("Extravagant") ||
                year >= 2015 && year <= 2018 && model.equalsIgnoreCase("Guzzler")) {
            System.out.println(! recalled);
        }
        else {
            System.out.println(recalled);
        }

           }
}
