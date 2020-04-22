package replit;

import java.util.Scanner;

public class _108_Print_Triangle {
    public static void main(String[] args) {


        int j = 1;
        int i = 1;
        Scanner scan = new Scanner(System.in);
       System.out.println("Enter a number");
        int n = scan.nextInt();

        while (j <= n){

            while ( i <= j ){
                System.out.print("*");
                i++;
            }
            System.out.println();
            j++;
        }






    }
}
