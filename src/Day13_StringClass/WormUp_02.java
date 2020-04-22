package Day13_StringClass;

import java.util.Scanner;

public class WormUp_02 {
    public static void main(String[] args) {

    /* write a program for the shipping info that, the program should ask:
					building number
					Street address (Assume it has more than one word)
					city name
					state name
					zip code
					full name of the person:
			and prints the ship to info in the following format:
			ex output:
					Ship To:  Jimmy joe
							  7925 Jones Branch Dr
							  MCLean, VA 22102
     */

    Scanner data = new Scanner (System.in);

        System.out.println("Enter the name");
        String name = data.nextLine();
        data.nextLine();

        System.out.println("Enter house number");
        int houseNum = data.nextInt();

        data.nextLine();

        System.out.println("Enter street name ");
        String street = data.nextLine();
        data.nextLine();

        System.out.println("Enter road type");
        String roadType = data.next();

        System.out.println("Enter city name");
        String city = data.next();

        System.out.println("Enter state name");
        String state = data.next();

        System.out.println("Enter the zip code");
        int zipCode = data.nextInt();

        String shipTo = name+"\n\t\t"+houseNum+" "+street+" "+roadType+"\n\t\t"+city+", "+state+", "+zipCode+".";

        System.out.println("Ship to: "+shipTo);






    }
}

