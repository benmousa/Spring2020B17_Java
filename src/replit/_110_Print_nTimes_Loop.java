package replit;

import java.util.Scanner;

public class _110_Print_nTimes_Loop {
    public static void main(String[] args) {

        int j = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");
        int n = scan.nextInt();

        for ( j = 0 ; n <= n ; j++){
            if ( j == n ){
                break;
            }
            System.out.print("*");
        }
}}
