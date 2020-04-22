package replit;

import java.util.Scanner;

public class _072_Email_1_StringMethods {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Email");
        String email = scan.next();

        String firstName = "";
        String lastName = "";
        String emailType = "";

        if (email.contains("_")) {
             firstName = email.substring(0, email.indexOf("_"));
             lastName = email.substring(email.indexOf("_") + 1, email.indexOf("@"));
             emailType = email.substring(email.indexOf("@"));
            System.out.println(lastName + "_" + firstName + "" + emailType);
        }
        else{
            System.out.println(email);
        }

    }
}
