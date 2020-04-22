package WormUps._04_02_2020;

import java.util.Scanner;

public class _01 {
    public static void main(String[] args) {
        Scanner data = new Scanner (System.in);

        System.out.println("Enter your First name");
        String firstName = data.next();

        System.out.println("Enter your Last Name");
        String lastName = data.next();

        String initials = firstName.substring(0,1).toUpperCase() + lastName.substring(0,1).toUpperCase();

        System.out.println(initials);



    }
}
