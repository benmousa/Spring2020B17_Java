package replit;

import java.util.Scanner;

public class _080_Online_Book_Merchants_Scanner_Operators_If {
    public static void main(String[] args) {

        int freeBooks = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Is a premium customer");
        boolean isPremiumCustomer = scan.nextBoolean();

        System.out.println("How many book purchased ");
        int nbooksPurchased = scan.nextInt();

        if ( isPremiumCustomer){
            if ( nbooksPurchased < 5 ) {
                System.out.println("0");
            }
            if ( nbooksPurchased >= 5 && nbooksPurchased < 8 ){
                System.out.println("1");
            }
            if ( nbooksPurchased >= 8 ){
                System.out.println("2" );
            }
        }
        else if (! isPremiumCustomer){
            if ( nbooksPurchased <= 6 ) {
                System.out.println("0");
            }
            if ( nbooksPurchased >= 7 && nbooksPurchased <= 11){
                System.out.println("1");
            }
            if ( nbooksPurchased >= 12 ){
                System.out.println("2" );
            }
        }


    }
}
