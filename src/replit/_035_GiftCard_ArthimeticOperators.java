package replit;

import java.util.Scanner;

public class _035_GiftCard_ArthimeticOperators {
    public static void main(String[] args) {

        Scanner data = new Scanner(System.in);

        System.out.println("Add your item");
        String item = data.nextLine();
        item = item.toLowerCase();

        boolean item1 = item.equals("smart phone") || item.equals("smartphone");
        boolean item2 = item.equals("lap top") || item.equals("laptop");
        boolean item3 = item.equals("charger");
        boolean item4 = item.equals("usb cable") || item.equals("usbcable");
        boolean item5 = item.equals("head phones") || item.equals("headphones");
        boolean item6 = item.equals("pants");
        boolean item7 = item.equals("hat");
        boolean item8 = item.equals("socks");
        boolean item9 = item.equals("blanket");
        boolean item10 = item.equals("pillow");

        byte balance = 100;

        if (item1){
            System.out.println("Sorry, not enough funds on your gift card!");
        }
        else if (item2){
            System.out.println("Sorry, not enough funds on your gift card!");
        }
        else if (item3){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: $"+(balance - 15 ));
        }
        else if (item4){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: $"+(balance - 10 ));
        }
        else if (item5){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: $"+(balance - 30 ));
        }
        else if (item6){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: $"+(balance - 50 ));
        }
        else if (item7){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: $"+(balance - 25 ));
        } else if (item8) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: $"+(balance - 5 ));
        }
        else if (item9){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: $"+(balance - 60 ));
        }
        else if ( item10){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: $"+(balance - 40 ));
        }
        else {
            System.out.println("Invalid item");
        }
    }

}
