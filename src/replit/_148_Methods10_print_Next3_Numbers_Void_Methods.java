package replit;

import java.util.Scanner;

public class _148_Methods10_print_Next3_Numbers_Void_Methods {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("enter number");
        int num = inp.nextInt();

        System.out.println((num + 1)+" "+(num + 2)+" "+(num + 3));
    }
}
