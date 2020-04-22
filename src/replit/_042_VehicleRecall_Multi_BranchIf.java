package replit;

import java.util.Scanner;

public class _042_VehicleRecall_Multi_BranchIf {

    public static void main(String[] args) {

        /* SDET Motors Inc. is recalling all vehicles from model years 1995-1998,  2001-2002,  2004-2006 and 2015-2017.
In this assignment you will write a program that will find vehicle for recall.
-Display prompt: "Enter vehicle's year:"
input: 1996
 if the value of modelYear does fall within the four recall ranges, display output:
"Your vehicle needs to be recalled!"
Otherwise, display message:
"Your vehicle is fine, enjoy!" */

        Scanner data = new Scanner(System.in);
        System.out.println("Enter Vehicle's year: ");
        int carYear = data.nextInt();
        String result = (carYear >=1995 && carYear <= 1998 || carYear >= 2001 && carYear <= 2002 || carYear >= 2004 &&
                         carYear <= 2006 || carYear >= 2015 && carYear <= 2017 )? " Your vehicle needs to  be recalled !"
                         : "Your vehicle is fine, enjoy !";

        System.out.println(result);

    }
}
