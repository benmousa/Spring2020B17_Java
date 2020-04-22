package Day13_StringClass;

import java.util.Scanner;

public class WormUp_04 {

    public static void main(String[] args) {
        Scanner data = new Scanner (System.in);

        System.out.println("Enter the name");
        String name = data.nextLine();

        data.nextLine();

        System.out.println("Enter house number");
        int houseNum = data.nextInt();

        data.nextLine();

        System.out.println("Enter street name ");
        String street = data.nextLine();

        System.out.println("Enter road type");
        String roadType = data.nextLine();

        System.out.println("Enter city name");
        String city = data.nextLine();

        System.out.println("Enter state name");
        String state = data.nextLine();

        data.nextLine();

        System.out.println("Enter the zip code");
        int zipCode = data.nextInt();

        String shipTo = name+"\n\t\t"+houseNum+" "+street+" "+roadType+"\n\t\t"+city+", "+state+", "+zipCode+".";

        System.out.println("Ship to: "+shipTo);







    }
}
