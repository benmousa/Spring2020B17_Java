package Day13_StringClass;

import java.util.Scanner;

public class StringMaipulations_Paractice {
    public static void main(String[] args) {

       // String str = "cyBerTek sChooL";
        Scanner data = new Scanner(System.in);

        System.out.println("Enter yuor full name");
        String str = data.nextLine();

        String firstName = str.substring(0, str.indexOf(" "));
        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();

        String lastName = str.substring(str.indexOf(" ")+1);
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();




        System.out.println("Your first name is: "+firstName);
        System.out.println("Your last name is: "+lastName);




    }
}
