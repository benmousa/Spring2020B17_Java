package replit;

import java.util.Scanner;

public class _031_ConsoleMenu_SingleIf {
    public static void main(String[] args) {

        Scanner data = new Scanner (System.in);
        System.out.println("-------------------");
        System.out.println("Select an option: ");
        System.out.println("\t 1) option 1.");
        System.out.println("\t 2) option 2.");
        System.out.println("\t 3) option 3.");
        System.out.println("--------------------");
        System.out.println("Enter here");
        int option = data.nextByte();

        if ( option <= 3){
            if ( option == 1){
            System.out.println("User selected 1");
        }
            if (option == 2){
                System.out.println("User selected 2");
            }
            if (option == 3){
                System.out.println("User selected 3");
            }

    }
}}
