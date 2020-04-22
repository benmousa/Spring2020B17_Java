package Day11_Scanner;

import java.util.Scanner;

public class nextLine_Paractice {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        System.out.println("Eneter your age here please");
        int age = data.nextInt();

        data.nextLine();

        System.out.println("Enter your full namer here please");
        String fullName = data.nextLine();

        System.out.println("\n");
        System.out.println("Your age is: "+age+" years old.");

        System.out.println("Your full name is: "+fullName+".");

    }

}
