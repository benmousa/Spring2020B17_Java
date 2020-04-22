package Day20_ArraysContinue;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.Scanner;

public class WormUp_02_Months {
    public static void main(String[] args) {

        Scanner data = new Scanner (System.in);
        String[] months = {"Jan", "Feb", "March", "April","May", "June","July", "Aug","Sep", "Oct", "Nov","Dec"};

        System.out.println("Enter the number");
        int num = data.nextInt();
        int count = 0;

        while ( num <= 0 || num > 12){
            System.out.println("Invalid Entry");
            System.out.println("Re-enter your number");
            data.nextInt();
            count++;

            if ( count == 3 &&  num <= 0 || num > 12){
                System.out.println("Locked");
                System.exit(0);
            }
        }


        String result = months[num-1];

        System.out.println(result);

       // for ( ) {

     //   }


    }
}
