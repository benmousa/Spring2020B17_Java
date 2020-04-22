package Day13_StringClass;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner data = new Scanner (System.in);

        System.out.println("Enter your Full Name please");
        String fullName = data.nextLine();

        String firstName = fullName.substring(0,fullName.indexOf(" "));
               firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
        String initial = firstName.substring(0,1);

        String lastName = fullName.substring(fullName.indexOf(" ")+1);
               lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();
        String initial2 = lastName.substring(0,1);

        System.out.println("Your first name is: "+firstName);
        System.out.println("your last name is: "+lastName);
        System.out.println("Your initials are: "+initial+initial2);



    }
}
