package replit;

import java.util.Scanner;

public class _085_Shopping_list2_Loop_Scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        //String item = "";
        //String countinue = "";
       // double price = 0;
        int count = 1;
        double totalPrice = 0;


        int i = 0;
        do {
            System.out.println("Enter Item1 and its price ");
            String item = scan.next();
            double price = scan.nextDouble();

            System.out.println("Add one more item?");
            String countinue = scan.next();

            if (countinue.equalsIgnoreCase("yes")) {
                System.out.println("add another item");
                item = scan.next();
                price = scan.nextDouble();

                System.out.println("Add one more item?");
                countinue = scan.next();
            }

            if ( countinue.equalsIgnoreCase("no")){
                System.out.println("thank you for shopping");
                System.out.println("Your total is: $"+price);
                break;
            }
            if ( item.equalsIgnoreCase("Tomatoes")){
                price += 5.5;
            }
            else if ( item.equalsIgnoreCase("cheese") ){
                price += 3.5;
            }
            else if (  item.equalsIgnoreCase("Apples")){
                price += 6.3;
            }
            else if ( item.equalsIgnoreCase("Lemons")){
                price += 2.3;
            }
            else if ( item.equalsIgnoreCase("Oranges")){
                price += 6.0;
            }

            System.out.println("Your total is: $"+price);
            i++;
        }
        while ( i <= 10 );

    }}
