package replit;

import java.util.Scanner;

public class _074_SMSmessage_StringMethods {
    public static void main(String[] args) {
/*
Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}

 */
        Scanner scan = new Scanner( System.in);

        System.out.println("Enter your message");
        String message = scan.nextLine();

        String sender = message.substring(message.indexOf("Sender"),message.indexOf("From"));
      //  String phoneNumber = message.substring(message.indexOf("Number"), message.indexOf("Message"));
       // String messageBody = message.substring(message.indexOf("Message"), message.indexOf(message.length()+1));

        System.out.println(sender);
      //  System.out.println(messageBody);

    }
}
