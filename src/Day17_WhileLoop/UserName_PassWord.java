package Day17_WhileLoop;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.Scanner;

public class UserName_PassWord {
    public static void main(String[] args) {

        Scanner data = new Scanner (System.in);
        System.out.println("Enter your User Name please");
        String userName = data.next();

        System.out.println("Enter your Pass Word please");
        String passWord = data.next();

        String yourUserName = new String("Cybertek");
        String yourPassWord = new String ("cybertek123");

       boolean  valid = userName.equalsIgnoreCase(yourUserName) && passWord.equalsIgnoreCase(yourPassWord);


       int count = 1;

        while (!valid ) {
            System.out.println("Please re-enter your User Name");
            userName = data.next();

            System.out.println("Please re-enter your Pass Word please");
            passWord = data.next();

         valid = userName.equalsIgnoreCase(yourUserName) && passWord.equalsIgnoreCase(yourPassWord);

         count ++;
         if ( count == 3 && !valid){
             System.out.println("Account Locked");
             break;
         }
        }
        if (valid) {
            System.out.println("Logged in");
        }

    }

}
