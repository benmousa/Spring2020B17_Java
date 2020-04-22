package Day24_Methods;

import java.util.Scanner;

public class Birthday {

    public static void age(int BirthYear) {
        Scanner data = new Scanner(System.in);
        System.out.println("Enter current year");
        int currentYear = data.nextInt();
        int age = currentYear - BirthYear;

        if (BirthYear < currentYear && BirthYear > 1900) {
            System.out.println("Your age is: " + age + " years old");
        }
        else {
            System.out.println("Invalid entry");
        }
    }

    public static void main(String[] args) {

       // age(2002);

        printHelloandCybertek();

    }

    public static void printHello(){
        System.out.println("Hello");
    }

    public static void printCyberek(){
        System.out.println("CyberTek");
    }
    public static void printHelloandCybertek(){
        printHello();
        printCyberek();
    }
}
