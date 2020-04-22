package replit;

import java.util.Scanner;

public class if_statement_burger_or_chicken {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String in = s.next();

        if ( in.equalsIgnoreCase("burger" ) || in.equalsIgnoreCase("chicken")){
            System.out.println("10.0");
        }
        if ( in.equalsIgnoreCase("soda")){
            System.out.println("2.0");
        }


    }
}
