package replit;

import java.util.Scanner;

public class _091_Count_Hi_Loop_String {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a statement");
        String str = scan.nextLine();

        int j = 0;

        //String index = str.indexOf("hi");
        int z = 0;
        for ( int i = 1; i<= str.indexOf("hi"); i++){
            z += i;
        }
        System.out.println(z);
    }
}
