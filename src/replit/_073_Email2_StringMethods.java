package replit;

import java.util.Scanner;

public class _073_Email2_StringMethods {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your email");
        String email = scan.next();

        String firstName = email.substring(0,email.indexOf("_"));
               firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
        String lastName = email.substring(email.indexOf("_")+1,email.indexOf("@"));
               lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();
        String domain = email.substring(email.indexOf("@")+1,email.indexOf("."));
        String domainLevel = email.substring(email.indexOf(".")+1);

        System.out.println("First name: "+firstName);
        System.out.println("Last Name "+lastName);
        System.out.println("Domain: "+domain);
        System.out.println("Top-Level Domain: "+domainLevel);









    }
}
