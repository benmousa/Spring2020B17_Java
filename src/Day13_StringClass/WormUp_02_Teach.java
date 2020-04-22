package Day13_StringClass;

import java.util.Scanner;

public class WormUp_02_Teach {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your building number");
        String buildingNum =  input.next();  //112A

        input.nextLine(); // Enter

        System.out.println("Enter your street address");
        String streetAddress = input.nextLine();

        System.out.println("Enter your city name");
        String cityName = input.nextLine();

        System.out.println("Enter your state");
        String stateName = input.nextLine();

        System.out.println("Enter your zip code");
        String zipCode = input.next();

        input.nextLine();  // Enter

        System.out.println("Enter your Full Name");
        String fullName = input.nextLine();

        String result = "Ship To:  "+fullName+"\n\t\t"+buildingNum+" "+streetAddress+"\n\t\t"+cityName+", "+stateName+" "+zipCode;

        System.out.println(result);



    }
}
