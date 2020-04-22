package Day12_Java_Recap;

import java.util.Scanner;

public class ScannerNext {
    public static void main(String[] args) {

        Scanner data = new Scanner (System.in);

        //String str = data.next();


        String address = " ";
        System.out.println("Enter the number of the building ");
        int bNum = data.nextInt();
        address +=bNum+" ";

        System.out.println("Enter the street name: ");
        String street = data.next();
        address += street+" ";

        System.out.println("Enter the road type ");
        String roadType = data.next();
        address += roadType+", ";

        System.out.println("Enter the city name, state, zip code");
        String city = data.next();
        address += city+", ";

        String state = data.next();
        address +=state+", ";

        int zipCode = data.nextInt();
        address += zipCode+".";

        String fullAddress = bNum+" "+street+" "+roadType+", "+city+", "+state+", "+zipCode;
        System.out.println("Address is: "+address);



    }


}
