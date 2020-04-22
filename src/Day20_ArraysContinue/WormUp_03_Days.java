package Day20_ArraysContinue;

import java.util.Scanner;

public class WormUp_03_Days {
    public static void main(String[] args) {

        String[] days = {"Monday", "Tuesday","Wednsday","Thursday",  "Friday", "Saturday", "Sunday" };

        Scanner data = new Scanner (System.in);

        System.out.println("Enter your number");
        int num = data.nextInt();

        int count = 1;

        while (num <= 0 || num > 7){
            System.out.println("Invalid Entry");
            System.out.println("Please re-enter a new number");
            num = data.nextInt();
            count ++;

            if ( count == 3 && num <= 0 || num > 7){
                System.out.println("Locked you entered 3 times");
                System.exit(0);
            }
        }

        String result = days[num-1];

        System.out.println(result);


    }


}
