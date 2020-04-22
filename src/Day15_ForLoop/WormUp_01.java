package Day15_ForLoop;

import java.util.Scanner;

public class WormUp_01 {
    public static void main(String[] args) {
        /*
        write a program that asks user's first and last name, then prints out the initials of the user
			Ex:
				input:
					cybertek
					batch12
				output:your initial is: CB
         */

        Scanner data = new Scanner(System.in);

        System.out.println("Enter your first name please");
        String firstName = data.next();
        firstName = firstName.toUpperCase();

        System.out.println("Enter your last name please");
        String lastName = data.next();
        lastName = lastName.toUpperCase();

        char str3 = firstName.charAt(0);
        char str4 = lastName.charAt(0);

        String initial = firstName.substring(0,1) + lastName.substring(0,1);

        System.out.println("Your initials are: "+str3+""+str4);

        System.out.println("Your initials are: "+initial);
    }
}
