package replit;

import java.util.Scanner;

public class _139_Methods1_Simple_Calculator_Void_Methods {
    public static void plus(int a, int b) {
        Scanner data = new Scanner (System.in);

        System.out.println("enter first number:");
        a = data.nextInt();

        System.out.println("enter second number:");
        b = data.nextInt();

        System.out.println( "result: "+(a + b));
    }

    public static void main(String[] args) {

        plus(0,0);
    }
}
