package replit;

import java.util.Scanner;

public class _083_Party_Loop_Scanner {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your guest name");
        String name = input.next();

        System.out.println("Do you want to enter new guest name");
        String guest = input.next();

        String guest2 = "";

        int i = 0;

        while ( i <= 124444444){
            if ( guest.equalsIgnoreCase("no")) {
                System.out.println(name);
                break;
            }
            if ( guest.equalsIgnoreCase("yes")){
                System.out.println("Please enter guest name");
                guest = input.next();
            }

            System.out.println("Do you want to enter new guest name");
             guest2 = input.next();

            if ( guest2.equalsIgnoreCase("no")) {
                System.out.println(name+", "+guest);
                break;
            }
            if ( guest2.equalsIgnoreCase("yes")){
                System.out.println("Please enter guest name");
                guest = input.next();
                System.out.println(name+", "+guest+", "+guest2);
            }

        }








    }
}
